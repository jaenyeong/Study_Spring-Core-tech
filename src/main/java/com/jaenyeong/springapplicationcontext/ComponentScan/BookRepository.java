package com.jaenyeong.springapplicationcontext.ComponentScan;

// 빈 등록
//@Repository
// 여러 개의 빈을 갖는 경우 앱 실행시 에러 발생
// 1) @Primary 어노테이션 사용
// 2) 모든 빈을 다 받음
// 3) @Qualifier 어노테이션 사용
//public class BookRepository {
public interface BookRepository {
}

