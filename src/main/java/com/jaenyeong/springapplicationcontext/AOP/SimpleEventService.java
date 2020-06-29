package com.jaenyeong.springapplicationcontext.AOP;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {

	// 어노테이션 생성, 태깅하지 않고 execution(표현식)만으로 할 수 있으나 조합되지 않는 것들이 있음
	// execution 어드바이스를 2개 만들 중복되는 코드를 Extract 메서드로 빼내는 방법이 있음
	// 하지만 IDE의 제대로 된 지원을 못받는 경우 등 어노테이션을 생성, 태깅하는 것이 더 직관적
	@PerfLogging
	@Override
	public void createEvent() {
		// 성능 측정 등 중복 코드 제거
//		long begin = System.currentTimeMillis();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Created an event");

//		System.out.println(System.currentTimeMillis() - begin);
	}

	@PerfLogging
	@Override
	public void publishEvent() {
		// 성능 측정 등 중복 코드 제거
//		long begin = System.currentTimeMillis();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Published an event");

//		System.out.println(System.currentTimeMillis() - begin);
	}

	public void deleteEvent() {
		System.out.println("Delete an event");
	}
}
