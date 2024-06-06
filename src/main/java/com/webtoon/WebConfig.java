package com.webtoon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.webtoon.util.LoginInterceptor;

//import kr.or.iei.AdminInterceptor;
//import kr.or.iei.LoginInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
	
	@Value("${file.root}")
	private String root;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//서버에 리소스(페이지, 첨부파일 등) 요청시 경로 찾아주는 로직
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/templates/", "classpath:/static/");
		registry.addResourceHandler("/board/**")
				.addResourceLocations("file:///"+root+"/board/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//		인터셉터 추가			로그인인터셉터를 추가
		registry.addInterceptor(new LoginInterceptor())
			//add~ : 인터셉터 적용	//exclude~ : 인터셉터 예외(인터셉터 작동 X)
			.addPathPatterns("/member/**", "/board/**")
			.excludePathPatterns("/member/signUpFrm", "/member/signUp", "/member/signInFrm", "/member/signIn", "/member/signOut"
					,"/board/boardList", "/board/boardView", "/board/boardView2", "/board/downloadFile");
	}
	
	//Spring Security의 BCryptPasswordEncoder 객체를 생성해놔야 BCryptPasswordEncoder 사용 가능
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
