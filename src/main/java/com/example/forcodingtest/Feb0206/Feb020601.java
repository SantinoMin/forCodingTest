package com.example.forcodingtest.Feb0206;

import java.util.HashMap;
import java.util.Map;

public class Feb020601 {

    class Solution {
        public int solution(int n) {

//          7조각씩이니깐, 무조건 7을 만들고 7이 안되면 피자+1을 추가하도록 해야될듯
//          피자의 수를 return 해야함
//          사람의 수 --> n

//         만약 2명이다 --> 7로 나웠
//         만약 8명이다 --> 7로 나눴을 때, 1판 + 1판
//         만약 15명이다 --> 2판 + 1판
//         만약 20명이다 --> 2판 + 1판
//         n을 7로 나눴을 때의 나머지가 6또는 6보다 작다면, 피자+1 필요

            int pizza = 0;
            int answer = 0;

            if(n > 7 && n % 7 <= 6){
                pizza = 1;
                answer = n/7 + pizza;
            } else {
                answer = 1;
            }
            return answer;
        }
    }
    }
//}
