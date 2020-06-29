package com.jaenyeong.springapplicationcontext.AOP;

import org.springframework.beans.factory.annotation.Autowired;

// 프록시 클래스를 생성하는 리소스 소요
// 프록시에도 중복된 코드를 심어야 함
// 동적으로(런타임) 타겟을 감싸는 프록시 객체를 만드는 방법이 있음
// 스프링 IoC는 기존 빈(타겟)을 대체하는 프록시 빈을 대신 만들어 등록 시켜줌
// AbstractAutoProxyCreator는 BeanPostProcessor 구현체
//@Primary
//@Service
public class ProxySimpleService implements EventService {

	@Autowired
	EventService simpleEventService;

	@Override
	public void createEvent() {
		long begin = System.currentTimeMillis(); // 중복 코드
		simpleEventService.createEvent();
		System.out.println(System.currentTimeMillis() - begin); // 중복 코드
	}

	@Override
	public void publishEvent() {
		long begin = System.currentTimeMillis(); // 중복 코드
		simpleEventService.publishEvent();
		System.out.println(System.currentTimeMillis() - begin); // 중복 코드
	}

	@Override
	public void deleteEvent() {
		simpleEventService.deleteEvent();
	}
}
