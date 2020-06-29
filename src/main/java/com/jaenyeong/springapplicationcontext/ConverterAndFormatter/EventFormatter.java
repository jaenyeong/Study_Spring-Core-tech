package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

// 컨버터와 다른 점은 로케일 기반으로 파싱을 할 수 있음
// 스레드 세이프 하기 때문에 빈 등록후 사용 가능
@Component
public class EventFormatter implements Formatter<Event> {

//	@Autowired
//	MessageSource messageSource;

	@Override
	public Event parse(String text, Locale locale) throws ParseException {
		return new Event(Integer.parseInt(text));
	}

	@Override
	public String print(Event object, Locale locale) {
		return object.getId().toString();
	}
}
