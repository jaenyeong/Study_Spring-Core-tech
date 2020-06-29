package com.jaenyeong.springapplicationcontext.AOP;

import java.lang.annotation.*;

/**
 * 성능 로깅 어노테이션
 */
// 어노테이션 @Retention의 RetentionPolicy 옵션은 디폴트 값이 CLASS(class 파일에도 남아 있음)
// RetentionPolicy.SOURCE는 컴파일 후 사라짐
// RUNTIME 까지는 사용할 필요가 없음
// 따라서 일반적으로는 @Retention 설정 없이 사용해도 무관함
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
