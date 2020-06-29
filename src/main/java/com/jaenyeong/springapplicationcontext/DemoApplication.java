package com.jaenyeong.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
// properties
//@PropertySource("classpath:/app.properties")
@EnableAsync
public class DemoApplication {

	// @SpringBootApplication 어노테이션 클래스 외부 패키지에 있기 때문에 Autowired 안됨
//	@Autowired
//	NoScanService noScanService;

	public static void main(String[] args) {
		// application_xml.md 파일에서 빈 설정을 하나씩 해줘야 하기 때문에 번거로움
//		ApplicationContext context = new ClassPathXmlApplicationContext("application_xml.md");
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanDefinitionNames));
//
//		BookService bookService = (BookService) context.getBean("bookService");
//		System.out.println(bookService.bookRepository != null);

		// config 파일로 configuration 설정 > 빈 설정
//		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanDefinitionNames));
//
//		BookService bookService = (BookService) context.getBean("bookService");
//		System.out.println(bookService.bookRepository != null);

		// 컴포넌트 스캐닝
		// 컴포넌트 스캐닝 대상은 @Repository, @Service, @Controller, @Configuration
		// 실제 스캐닝은 ConfigurationClassPostProcessor라는 BeanFactoryPostProcessor에 의해 처리됨
		// BeanPostProcessor와 달리 다른 빈 객체를 만들기 이전에 적용됨

		// 빈을 앱 구동 초기에 등록하는 과정으로 인해서 다소 느릴 수 있으나 큰 성능 저하는 아님
		// 문제가 된다면 functional을 사용하여 빈 등록할 수 있음
		// 리플렉션, 프록시는 성능에 영향을 줌 (앱 구동 타임)

//		SpringApplication.run(DemoApplication.class, args);

		// 서버 구동 시 위 스태틱 메서드 사용 방법 대신 2가지 방법이 있음 - 빌더 사용, 인스턴스 생성
		// 아래는 인스턴스 생성 방법
		// java 10 ver
		// 아래와 같이 빈을 일일히 등록하는 것은 너무도 많은 설정을 하는 예전으로 퇴보하는 것(불편함)
//		var app = new SpringApplication(DemoApplication.class);
//		app.addInitializers(
//				(ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
//					ctx.registerBean(NoScanService.class);
//					ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!"));
//				});
//		app.run(args);

//		SpringApplication.run(DemoApplication.class, args);

		// 앱을 실행하는 다른 방법
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

	@Bean
	public MessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(3);
		return messageSource;
	}
}
