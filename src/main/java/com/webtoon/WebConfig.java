package com.webtoon;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//서버에 리소스(페이지, 첨부파일 등) 요청시 경로 찾아주는 로직
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/templates/", "classpath:/static/");
		//첨부파일 경로도 추가해야
	}
	
	//인터셉터도 추가해야함
	
}
