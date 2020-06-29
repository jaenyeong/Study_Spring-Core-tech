package com.jaenyeong.springapplicationcontext.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// @Scope 어노테이션에 proxyMode 설정
// proxyMode 기본값 ScopedProxyMode.DEFAULT (프록시를 사용하지 않음)
// ScopedProxyMode.TARGET_CLASS를 사용한 경우 CGLIB를 사용한 dynamic proxy가 적용됨
// 원래 자바 JDK에서는 인터페이스 기반 프록시만 생성 가능
// TARGET_CLASS 옵션을 사용함으로써 클래스를 기반으로 한 프록시를 생성, 빈으로 등록 (프록시 빈을 주입하게 됨)
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)

// 또 다른 방법은 @Scope(value = "prototype")는 그대로 사용, 아래와 같이 Single 클래스 코드 변경
// private ObjectProvider<Proto> proto;
//@Scope(value = "prototype")
public class Proto {

	// Proto type scope 인스턴스가 Singleton scope 인스턴스 사용(참조)하는 것은 문제 없음
	@Autowired
	Single single;
}
