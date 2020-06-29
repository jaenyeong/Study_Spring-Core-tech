package com.jaenyeong.springapplicationcontext.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

	@Autowired
	Proto proto;

	// 소스 코드에 스프링 코드가 삽입되는 것이므로 그다지 좋은 코드가 아닐 수 있음
//	@Autowired
//	private ObjectProvider<Proto> proto;

	public Proto getProto() {
		return proto;
	}

//	public Proto getProto() {
//		return proto.getIfAvailable();
//	}
}
