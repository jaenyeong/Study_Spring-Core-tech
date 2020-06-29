package com.jaenyeong.springapplicationcontext.ComponentScan;

//@Configuration
//// 옵션에 설정한 클래스 파일부터 컴포넌트 스캐닝
//@ComponentScan(basePackageClasses = DemoApplication.class)
public class ApplicationConfig {

	// 위 @ComponentScan 애노테이션 설정시 아래처럼 빈을 직접 설정하지 않아도 됨
//	@Bean
//	public BookRepository bookRepository() {
//		return new BookRepository();
//	}
//
//	@Bean
//	public BookService bookService() {
//		BookService bookService = new BookService();
//		// BookRepository가 Bean으로만 설정이 되어 있다면
//		// BookService 내부에서 BookRepository를 @Autowired 사용할 수 있음
//		// 아래처럼 직접 setter로 설정(주입) 안해도 됨
////		bookService.setBookRepository(bookRepository());
//		return bookService;
//	}
}
