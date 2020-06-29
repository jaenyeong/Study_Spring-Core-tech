package com.jaenyeong.springapplicationcontext;

import com.jaenyeong.springapplicationcontext.NullSafety.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
//	@Autowired
//	Single single;
//
//	@Autowired
//	Proto proto;

//	@Autowired
//	ApplicationContext ctx;

//	@Autowired
//	EnvBookRepository envBookRepository;

//	@Value("${app.name}")
//	String appName;

//	@Autowired
//	MessageSource messageSource;

//	@Autowired
//	ApplicationEventPublisher publisherEvent;

//	@Autowired
//	ResourceLoader resourceLoader;

	// 스프링부트 2.3.0 버전 이후부터 starter-validation을 포함하지 않아 의존성 관리, 추가를 따로 해줘야 함
	// pom.xml - spring-boot-starter-validation 의존성 추가
//	@Autowired
//	Validator validator;

//	@Autowired
//	ConversionService conversionService;

	// #으로 시작하는 건 표현식을 사용하는 방법
	// $으로 시작하는 건 프로퍼티를 참조하는 방법
	// 주의!
	// 표현식 안에는 프로퍼티를 사용 가능
	// 프로퍼티 안에는 표현식을 사용할 수 없음
	//

//	@Value("#{1 + 1}")
//	int value;
//
//	@Value("#{'hello ' + 'world'}")
//	String greeting;
//
//	@Value("#{1 eq 1}")
//	boolean trueOrFalse;
//
//	@Value("Hello")
//	String hello;
//
//	@Value("${my.value}")
//	int myValue;
//
//	@Value("#{${my.value} eq 100}")
//	boolean isMyValue100;
//
//	@Value("#{'spring'}")
//	String spring;
//
//	@Value("#{sample.data}")
//	int sampleData;

	@Autowired
	EventService eventService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println(proto);
//		System.out.println(single.getProto());

//		System.out.println(ctx.getBean(Proto.class));
//		System.out.println(ctx.getBean(Proto.class));
//		System.out.println(ctx.getBean(Proto.class));
//
//		System.out.println("----------------------");
//
//		System.out.println(ctx.getBean(Single.class));
//		System.out.println(ctx.getBean(Single.class));
//		System.out.println(ctx.getBean(Single.class));
//
//		System.out.println("----------------------");
//
//		System.out.println(ctx.getBean(Single.class).getProto());
//		System.out.println(ctx.getBean(Single.class).getProto());
//		System.out.println(ctx.getBean(Single.class).getProto());

		// EnvironmentCapable 인터페이스 내의 getEnvironment 메서드가 Environment 반환
		// Profile 정의하는 방법
		// 1) @Configuration @Profile
		// 2) @Component @Profile
//		Environment environment = ctx.getEnvironment();
//		System.out.println(Arrays.toString(environment.getActiveProfiles()));
//		System.out.println(Arrays.toString(environment.getDefaultProfiles()));

		// IDEA run configurations VM options [-Dapp.name="noah"] 입력
//		System.out.println(environment.getProperty("app.about"));

		// StandardServletEnvironment의 우선순위
		// - ServletConfig 매개변수
		// - ServletContext 매개변수
		// - JNDI (java:comp/env/)
		// - JVM 시스템 프로퍼티 (-Dkey=”value”)
		// - JVM 시스템 환경 변수 (운영 체제 환경 변수)
		// IDEA run configurations VM options [-Dapp.name="VMOptions"] 입력
		// app.properties 파일에 app.name=properties 입력
		// 결과는 VMOptions 출력됨
//		System.out.println(environment.getProperty("app.name"));
//		System.out.println(appName);

//		System.out.println(messageSource.getClass());
//		System.out.println(messageSource.getMessage("greeting", new String[]{"noah"}, Locale.KOREA));
//		System.out.println(messageSource.getMessage("greeting", new String[]{"noah"}, Locale.US));
//		System.out.println(messageSource.getMessage("greeting", new String[]{"noah"}, Locale.getDefault()));

//		while (true) {
//			System.out.println(messageSource.getMessage("greeting", new String[]{"noah"}, Locale.KOREA));
//			System.out.println(messageSource.getMessage("greeting", new String[]{"noah"}, Locale.US));
//			Thread.sleep(1000L);
//		}

		// ApplicationEventPublisher
//		publisherEvent.publishEvent(new MyEvent(this, 100));

//		System.out.println(ctx.getClass());
//		System.out.println(ctx.getClass().getResource("classpath:test.txt"));
//		System.out.println(ctx.getClass().getResource("test.txt"));

//		Resource resource = resourceLoader.getResource("classpath:test.txt");
//		Resource resource = resourceLoader.getResource("test.txt"); // ServletContextResource
//		System.out.println(resource.getClass());
//
//		System.out.println(resource.exists());
//		System.out.println(resource.getDescription());
//		// java 11 ver
//		System.out.println(Files.readString(Path.of(resource.getURI())));

		// 클래스 패스 기준으로 문자열을 이용해 해당 위치 리소스 접근
//		var ctx = new ClassPathXmlApplicationContext("xxx.xml");
		// 파일 시스템 경로 기준으로 문자열을 이용 해당 위치 리소스 접근
//		var ctx = new FileSystemXmlApplicationContext("xxx.xml");

		// ClassPathXmlApplicationContext, FileSystemXmlApplicationContext 같은 경우는 내부적으로 다른 구현체를 사용하게 됨
		// Resource의 타입은 locaion 문자열과 ApplicationContext의 타입에 따라 결정
		// - ClassPathXmlApplicationContext -> ClassPathResource
		// - FileSystemXmlApplicationContext -> FileSystemResource
		// - WebApplicationContext -> ServletContextResource

		// ApplicationContext의 타입에 상관없이 리소스 타입을 강제하려면 java.net.URL
		// 접두어(+ classpath:)중 하나를 사용할 수 있음 (가급적 접두어를 사용하는 것을 추천)
		// - classpath:me/whiteship/config.xml -> ClassPathResource
		// - file:///some/resource/path/config.xml -> FileSystemResource

		// Bean Validation - Java EE spec
//		System.out.println(validator.getClass());
//
//		Event event = new Event();
//		event.setLimit(-1);
//		event.setEmail("abc");
//
////		EventValidator eventValidator = new EventValidator();
////		System.out.println(eventValidator.getClass());
//
//		Errors errors = new BeanPropertyBindingResult(event, "event");
//
////		eventValidator.validate(event, errors);
//		validator.validate(event, errors);
//
//		System.out.println(errors.hasErrors());
//
//		errors.getAllErrors().forEach(e -> {
//			System.out.println("--- err code ---");
//			Arrays.stream(Objects.requireNonNull(e.getCodes())).forEach(System.out::println);
//			System.out.println(e.getDefaultMessage());
//		});

		// 아래와 같이 컨버팅 유무 확인 후 사용
		// 일반적으로 직접 사용되지 않음
//		conversionService.canConvert();
//		conversionService.convert();

		// WebConversionService 출력됨 > 스프링 부트에서 제공되는 클래스
		// WebConversionService는 DefaultFormattingConversionService 클래스를 상속받아 생성된 클래스
//		System.out.println(conversionService.getClass().toString());

//		System.out.println("=================");
//		System.out.println(value);
//		System.out.println(greeting);
//		System.out.println(trueOrFalse);
//		System.out.println(hello);
//		System.out.println(myValue);
//		System.out.println(isMyValue100);
//		System.out.println(spring);
//		System.out.println(sampleData);

		// SpEL (Spring Expression Language)
		// ExpressionParser, EvaluationContext 개념 숙지

//		ExpressionParser parser = new SpelExpressionParser();
//		Expression expression = parser.parseExpression(" 2 + 100");
//		// 이 때 ExPL도 컨버전 서비스를 사용함
//		Integer integerValue = expression.getValue(Integer.class);
//		System.out.println(integerValue);

		// 사용 가능한 곳
		// @Value, @ConditionalOnExpression 어노테이션
		// 스프링 시큐리티 - @PreAuthorize, @PostAuthorize, @PreFilter, @PostFilter, XML 인터셉터 URL 설정 등
		// 스프링 데이터 - @Query 어노테이션
		// 타임리프

		// AOP
		// 관점 지향
		// Aspect : 타겟, 포인트 컷 등을 묶은 모듈
		// Advice : 특정 지점에서 수행해야 할 작업 (트랜잭션, 로깅, 성능분석 등)
		// Target : 포인트컷이 있는, 수행할 작업이 적용될 대상(클래스)
		// Joinpoint : 수행되어야 하는 지점 (대개 메서드 실행 시점, 그 외 생성자 호출이나 필드 접근 등이 있음)
		// Pointcut : 조인 포인트의 묶음

		// 구현체
		// AspectJ
		// 스프링 AOP

		// 적용 방법
		// 컴파일 - 바이트코드 생성 시 적용됨, AspectJ 사용
		// - 로드 타임, 런타임 시 성능 저하가 없음, 별도의 컴파일 과정을 거쳐야 함

		// 로드 타임 - 컴파일 후 해당 타켓을 로딩하는 시점에(로드 타임 위빙) 어드바이스 작업을 삽입, AspectJ 사용
		// - 로드 시 약간의 성능 부하, 로드 타임 위버 설정 필요, 다양한 문법 사용 가능

		// 런타임 - 런타임시 프록시 빈을 만들어 어드바이스 작업을 수행하고 본 객체 작업을 수행함, 스프링 AOP 사용
		// - 런타임 시 약간의 성능 부하(최초의 빈 로딩 시에만), 별도 설정이나 컴파일러 필요 없음, 문법 쉬움, 크게 어렵지 않음
		// - 제일 자주 쓰이는 방법

//		eventService.createEvent();
//		eventService.publishEvent();
//		eventService.deleteEvent();

		// NUll-safety
		// @NonNUll 어노테이션을 태깅해도 컴파일 에러가 안남
		// 인텔리제이 설정 (command + ,)
		// > Build, Execution, Deployment > Compiler > Configure annotations... > 스프링 어노테이션이 없음 (추가 필요)
		// 스프링에 nullable, NonNull 추가
//		String message = eventService.createEvent(null); // 컴파일 시 경고 출력
		String message = eventService.createEvent("Noah");

		// 패키지 레벨 설정
		// @NonNullApi
		// @NonNullFields
		// package-info.java 파일에 설정
	}
}
