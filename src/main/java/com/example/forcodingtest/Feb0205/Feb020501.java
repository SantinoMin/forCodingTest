package com.example.forcodingtest.Feb0205;

public class Feb020501 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 분모, 분자 통분하기
        //분자
        int numer = numer1 * denom2 + denom1 * numer2; // 4 + 6 = 10
        //분모
        int denom = denom1 * denom2; // 8
        int max = 1;

        for (int i = 1; i <= denom && i <= numer; i++) {
            //i=2일 때, demon=4, numer=5
            if (denom % i == 0 && numer % i == 0) {
                max = i; // max = 2
                // 분모, 분자 통분한 값의 최대공약수 구하기

            }
        }

        numer = numer / max;
        denom = denom / max;

        int[] answer = {numer, denom};
        return answer;
    }
}
