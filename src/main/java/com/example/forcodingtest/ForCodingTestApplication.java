package com.example.forcodingtest;

import com.example.forcodingtest.Feb0205.Feb020501;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForCodingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForCodingTestApplication.class, args);


        // FebTest 객체 생성 후 solution 메서드 호출
        Feb020501 febTest = new Feb020501();
        int[] result = febTest.solution(1, 2, 3, 4); // 예시로 1/2 + 3/4를 계산
        System.out.println("Result: " + result[0] + "/" + result[1]);
    }
}
