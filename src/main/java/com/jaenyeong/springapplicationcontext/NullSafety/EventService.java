package com.jaenyeong.springapplicationcontext.NullSafety;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class EventService {

	@NonNull
	public String createEvent(@NonNull String name) {
		return "Hello" + name;
//		return null; // 컴파일 시 경고 출력
	}
}
