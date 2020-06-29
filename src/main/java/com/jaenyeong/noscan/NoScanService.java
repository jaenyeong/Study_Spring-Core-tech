package com.jaenyeong.noscan;

// DemoApplication 클래스에 아래와 같은 빈 등록으로 @Service 어노테이션 생략
//  app.addInitializers(
//		(ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
//			ctx.registerBean(NoScanService.class);
//			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!"));
//		});
//@Service
public class NoScanService {
}
