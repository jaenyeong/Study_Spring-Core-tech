package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

// 컨버터보다는 포매터를 추천
// JPA에는 이미 컨버터가 포함되어 있음
public class EventConverter {

	// PropertyEditor와 동일한 역할
	// 상태 정보가 없기 때문에 @Component 어노테이션으로 빈으로 등록하여 사용 가능
	// 하지만 일반적으로 ConverterRegistry에 등록해 사용
	@Component
	public static class StringToEventConverter implements Converter<String, Event> {

		@Override
		public Event convert(String s) {
			return new Event(Integer.parseInt(s));
		}
	}

	@Component
	public static class EventToStringConverter implements Converter<Event, String> {

		@Override
		public String convert(Event event) {
			return event.getId().toString();
		}
	}
}
