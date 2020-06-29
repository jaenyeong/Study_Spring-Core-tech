package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

import java.beans.PropertyEditorSupport;

// PropertyEditor 인터페이스를 구현하면 오버라이딩 할 메서드가 너무 많음
//public class EventEditor implements PropertyEditor {
public class EventEditor extends PropertyEditorSupport {
	// 서로 다른 스레드에게 공유됨 > 스레드 세이프 하지 않음
	// stateful > 상태 정보를 저장함
	// 따라서 PropertyEditor의 구현체들은 여러 스레드에 공유해서 사용하지 말 것
	// @Component, @Bean 등 빈으로 등록해서 사용하면 안됨
	// 스레드 스코프로 만들어 사용하면 괜찮으나 가급적 빈으로 사용하지 말 것
	@Override
	public String getAsText() {
//		return super.getAsText();
		Event event = (Event) getValue();
		return event.getId().toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
//		super.setAsText(text);
		setValue(new Event(Integer.parseInt(text)));
	}
}
