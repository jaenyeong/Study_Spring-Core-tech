package com.jaenyeong.springapplicationcontext.ComponentScan;

import org.springframework.stereotype.Service;

// 빈 등록
@Service
public class BookService {
//public class BookService implements InitializingBean {
	// 의존성 주입
	// @Qualifier 어노테이션으로 여러 개의 빈이 있는 경우 기본 빈 설정
	// @Qualifier 보다 @Primary 어노테이션이 type safe하여 @Primary를 사용하는 것을 추천
//	@Autowired
////@Qualifier("noahBookRepository")
//	BookRepository bookRepository;

	// 여러 개의 빈을 모두 받음
//	@Autowired
//	List<BookRepository> bookRepositoryList;

	// 여러 개의 빈이 있는 경우 필드(빈)의 이름을 통해 주입 시킴
	// 추천하지 않는 방법
//	@Autowired
//	BookRepository noahBookRepository;

//	@Autowired
//	public BookService(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}

	// BookRepository 클래스의 @Repository 어노테이션을 태깅하지 않고
	// setter에 @Autowired 어노테이션 태깅시 서버 실행 에러
	// 따라서 @Autowired required 옵션에 false 설정
//	@Autowired(required = false)
//	public void setBookRepository(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}

	public void printBookRepository() {
//		System.out.println(bookRepository.getClass());
//		this.bookRepositoryList.forEach(System.out::println);
//		System.out.println(noahBookRepository.getClass());
	}

	// 의존성 주입은 BeanPostProcessor 라이프 사이클 인터페이스의 구현체에 의해서 관리됨
	// Bean의 인스턴스 생성 후 초기화 전, 후 라이프 사이클 콜백
	// postProcessorBeforeInitialization method of BeanPostProcessor
	// InitializingBean's after PropertiesSet
	// postProcessorAfterInitialization method of BeanPostProcessor
	// AutowiredAnnotationBeanPostProcessor 클래스 작동으로 의존성 주입 (@Autowired 어노테이션 처리)
	// @PostConstruct 어노테이션, InitializingBean 인터페이스 구현(afterPropertiesSet 메서드 재정의)

	// BeanFactory가 BeanPostProcessor 타입의 빈을 찾음
	// AutowiredAnnotationBeanProcessor(BeanPostProcessor의 구현체 중 하나)가
	// 다른 일반 빈들에게 BeanPostProcessor의 기능(처리하는 로직) 등을 적용함

	// 라이프 사이클 콜백
	// 의존성 주입을 받는 필드는 아래 메서드 이미 주입 완료된 것
//	@PostConstruct
//	public void setUp() {
//		System.out.println(noahBookRepository.getClass());
//	}

	// InitializingBean을 구현하는 경우 아래 메서드 재정의
//	@Override
//	public void afterPropertiesSet() throws Exception {
//	}
}
