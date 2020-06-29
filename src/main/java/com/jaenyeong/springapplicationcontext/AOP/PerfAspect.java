package com.jaenyeong.springapplicationcontext.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

	// @Around - 메서드를(조인 포인트, 포인트 컷) 감싸는 형태로 적용이 됨
//	@Around("execution(* com.jaenyeong..*.*(..))")
//	@Around("execution(* com.jaenyeong..*.EventService.*(..))")
//	@Around("bean(simpleEventService)") // 해당 빈의 모든 메서드에 적용됨
	@Around("@annotation(com.jaenyeong.springapplicationcontext.AOP.PerfLogging)")
	public Object longPerf(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
	}

	@Before("bean(simpleEventService)")
	public void hello() {
		System.out.println("Hello");
	}
}
