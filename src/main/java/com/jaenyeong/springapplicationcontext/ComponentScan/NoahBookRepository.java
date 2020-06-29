package com.jaenyeong.springapplicationcontext.ComponentScan;

import org.springframework.stereotype.Repository;

@Repository
// 여러 개의 빈이 있는 경우 @Primary 어노테이션 태깅
//@Primary
public class NoahBookRepository implements BookRepository {
}
