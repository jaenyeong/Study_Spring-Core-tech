package com.jaenyeong.springapplicationcontext.EventPublisher;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

//@Component
// 4.2 이후 버전부터는 ApplicationListener를 구현하지 않아도 됨
// 다만 핸들러는 계속 빈으로 등록되어야 함
//public class MyEventHandler implements ApplicationListener<MyEvent> {
public class MyEventHandler {

//	@Override
//	public void onApplicationEvent(MyEvent event) {
//		System.out.println("이벤트 수신. 데이터: " + event.getData());
//	}

	// @EventListener 어노테이션 태깅하여 핸들러 등록
	// 메소드명은 편한대로 정의
	@EventListener
	// 순서 지정
//	@Order(Ordered.HIGHEST_PRECEDENCE)
	// 비동기 실행 - @EnableAsync를 메인 클래스에 태깅해야 비동기 실행 가능
	@Async
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("이벤트 수신. 데이터: " + event.getData());
	}

	@EventListener
	@Async
	public void handle(ContextRefreshedEvent event) {
		System.out.println("ContextRefreshedEvent");
		System.out.println(Thread.currentThread().toString());
	}

	@EventListener
	@Async
	public void handle(ContextClosedEvent event) {
		System.out.println("ContextClosedEvent");
		System.out.println(Thread.currentThread().toString());
	}
}
