package com.jaenyeong.springapplicationcontext.Profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
// test profile인 경우에만 빈을 찾을 수 있음
// 프로파일 설정
// -Dspring.profiles.active="test" .. 또는 @ActiveProfiles(테스트용)
// IDEA run configurations 창에서 Active profiles 옵션 설정 또는 VM options 옵션에 -Dspring.profiles.active="test" 설정
//@Profile("test")
public class TestConfiguration {

//	@Bean
//	public EnvBookRepository bookRepository() {
//		return new EnvTestBookRepository();
//	}
}
