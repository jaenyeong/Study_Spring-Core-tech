package com.jaenyeong.springapplicationcontext.EventPublisher;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

//@Component
public class AnotherHandler {

	// 이벤트 핸들러의 순서는 보장하지 않지만 핸들러는 하나의 스레드에서 순차적으로 실행됨
	@EventListener
	// 순서 지정
//	@Order(Ordered.HIGHEST_PRECEDENCE + 2)
	// 비동기 실행 - @EnableAsync를 메인 클래스에 태깅해야 비동기 실행 가능
	@Async
	public void handle(MyEvent myEvent) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("Another data : " + myEvent.getData());
	}
}
