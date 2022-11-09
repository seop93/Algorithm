package week8.Algorithm_1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Hashad {
    public boolean solution(int x) {

        int sum = 0;
        int a = x;
        while (a > 0) {
            sum += a % 10; // 1의 자릿수부터 나눠가며 나머지 더하기
            a = a / 10; // sum에서 더해준 자릿수 빼기
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int[] solution2(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) return new int[]{-1};
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public int[] solution3(int[] arr, int divisor){
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        //list를 Array로 바꾸고
        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }

}
