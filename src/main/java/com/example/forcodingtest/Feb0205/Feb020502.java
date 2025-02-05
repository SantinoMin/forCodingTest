package com.example.forcodingtest.Feb0205;

public class Feb020502 {
    class Solution {
        public int[] solution(int n) {

            // 예_10  --> [1, 3, 5, 7, 9]

            int[] answer;

            //짝수인 경우
            if(n % 2 == 0){
                answer = new int[n/2];

            } else {
                //홀수인 경우
                answer = new int[n/2+1];
            }

            for(int i = 0; i < answer.length; i++){

                answer[i] = (i*2) + 1;
            }
            return answer;
        }
    }
}
