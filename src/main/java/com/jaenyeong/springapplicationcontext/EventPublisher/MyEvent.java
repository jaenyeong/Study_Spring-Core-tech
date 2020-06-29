package com.jaenyeong.springapplicationcontext.EventPublisher;

// 4.2 이전버전까지는 ApplicationEvent를 상속받아 이벤트 처리
// 스프링 소스코드가 최대한 관여하지 않는 상태가 스프링이 추구하는 형태(최대한 POJO 형태)
// 이벤트는 빈으로 등록하지 않음
//public class MyEvent extends ApplicationEvent {
public class MyEvent {
	private int data;
	// 추가
	private Object source;

//	/**
//	 * Create a new {@code ApplicationEvent}.
//	 *
//	 * @param source the object on which the event initially occurred or with
//	 *               which the event is associated (never {@code null})
//	 */
//	public MyEvent(Object source) {
//		super(source);
//	}
//
//	public MyEvent(Object source, int data) {
//		super(source);
//		this.data = data;
//	}

	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Object getSource() {
		return source;
	}
}
