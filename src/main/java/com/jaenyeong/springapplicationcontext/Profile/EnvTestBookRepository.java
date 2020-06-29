package com.jaenyeong.springapplicationcontext.Profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
// profile 설정
//@Profile("test")
@Profile("!prod") // prod가 아닌 경우 (!, &, | 사용 가능)
public class EnvTestBookRepository implements EnvBookRepository {
}
