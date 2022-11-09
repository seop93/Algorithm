package week8.Algorithm_1108;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 7;

        //중간값 찾기
        int startIdx = 0;
        int endIdx = nums.length - 1;
        int targetIdx = -1;
        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            //인덱스(시작점, 끝점) 옮기기

            if (nums[midIdx] == targetNum) {
                targetIdx = midIdx;
                break;
            }
            if (nums[midIdx] > targetNum) {
                endIdx = midIdx - 1;
            } else {
                startIdx = midIdx + 1;

            }

        }
        System.out.println(targetIdx);
    }
}
