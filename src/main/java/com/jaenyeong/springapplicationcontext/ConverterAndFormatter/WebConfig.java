package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

import org.springframework.format.FormatterRegistry;

// 부트를 사용시 컨버터와 포매터를 직접 빈으로 등록할 경우 이와 같이 설정하지 않아도 됨
// 즉 컨버터와 포매터를 사용하기 위해 스프링 MVC 설정을 직접 만들 필요가 없음
// 컨버터, 포매터가 빈으로 등록되어 있다면 스프링부트가 ConversionService에 등록을 자동으로 해줌
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
public class WebConfig {

//	@Override
	public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter(new EventConverter.StringToEventConverter());
//		registry.addFormatter(new EventFormatter());
	}
}
