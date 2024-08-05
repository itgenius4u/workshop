package com.test.myapp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1. 도메인에 대한 이해
// 2. 엔터티에 구분
// Library -> books, authors, members, loans
// Domain Driven-Design (DDD) + microservices
// 3. 엔터티간의 관계
// 책은 작가가 쓴다.
// 고객은 책 빌린다.
// 고객은 대출해서 빌린다.
// 4. 리소스에 대한 정의
// /books, /authors, /members, /loans
// 동사안되고 명사형을 선택
// /findBooks(x), /books(o)


@SpringBootApplication
public class Myapp4Application {
	public static void main(String[] args) {
		SpringApplication.run(Myapp4Application.class, args);
	}
}
