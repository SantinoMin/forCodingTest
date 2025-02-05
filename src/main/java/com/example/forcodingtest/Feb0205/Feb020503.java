package com.example.forcodingtest.Feb0205;
import java.util.Map;
import java.util.HashMap;

public class Feb020503 {


    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int maxCount = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for(int number: array){
                //예시 [1, 2, 3, 3, 3, 4]

                int count = map.getOrDefault(number, 0) + 1; // map에 number가 있다면 (있는 number값 반환), number가 3이라면 (3)+1;
                // map에 number가 없다면 (0 반환), number가 없으니 (0) + 1;
                if(count > maxCount){
                    maxCount = count;
                    // number=1인 경우 count=1, maxCount = 1;
                    // number=2인 경우, count=1, maxCount=1;
                    // number=3인 경우, count=1, maxCount =1;
                    // number=3인 경우, count=
                    answer = number;  // answer = 1;      // number=2인 경우, count=1, maxCount=1
                } else if(count == maxCount){
                    answer = -1;
                }

                map.put(number, count);
            }

            // 테스트
            // map[0] = 1인 경우, map.put(1,1);
            // map[1] = 2인 경우, map.put(2,1);
            // map[2] = 3인 경우, map.put(3,1);
            // map[3] = 3인 경우, map.put(3,2);

            return answer;
        }
    }
}
