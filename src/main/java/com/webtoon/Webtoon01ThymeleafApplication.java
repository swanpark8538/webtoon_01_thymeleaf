package com.webtoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})//암호화 기본세팅 제거
@EnableAspectJAutoProxy(proxyTargetClass = true)//관점지향프로그래밍 적용 - 패스워드 암호화에서 활용됨.
public class Webtoon01ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(Webtoon01ThymeleafApplication.class, args);
	}

}
