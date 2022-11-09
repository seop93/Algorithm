package week7.Algorithm_1102;

import java.util.Arrays;

public class SpeedPrime {
    public void isPrime(int N) {
        int[] arr = new int[N - 1]; // N - 1 개 만큼 2 ~ 50까지 총 49개
        boolean[] checks = new boolean[arr.length]; // arr 만큼 checks 생성
        Arrays.fill(checks, true); // checks를  true 로 초가화

        for (int i = 0; i < arr.length ; i++){
            arr[i] = i + 2;
        }

        //2의 배수 지우기
        // 0 1 2 3 4 5 6 7 8
        // 2 3 4 5 6 7 8 9 10

        int multipleOf = 2;

        for (int i = 2; i < arr.length ; i+= 2) {
            checks[i] = false;
        } // checks를 참고해서 true인  nums[i]만 출력
        multipleOf = 3;
        for (int i = 4; i < arr.length ; i += 3) {

        }

    }

    public static void main(String[] args) {

    }


}
