package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

	// PropertyEditor를 구현, 상속한 에디터를 빈으로 등록하여 사용하는 대신 @InitBinder 사용
	// WebDataBinder는 DataBinder의 구현체 중 하나
	// PropertyEditor를 구현한 에디터를 만들어도 스레드 세이프 하지 않기 때문에 빈으로 등록해 사용할 수 없고
	// PropertyEditor의 구현체는 Object와 String 간 변환만 할 수 있어 사용 범위가 제한적
	// 매번 만들어 사용하기 번거롭기 때문에 이런 방식으로 사용하지 않음
//	@InitBinder
//	public void init(WebDataBinder webDataBinder) {
//		webDataBinder.registerCustomEditor(Event.class, new EventEditor());
//	}

	@GetMapping("/event/{event}")
	public String getEvent(@PathVariable Event event) {
		System.out.println(event);
		return event.getId().toString();
	}
}
