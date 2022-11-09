package week8.Algorithm_1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DivideArr {

    public int[] check(int[] arr, int divisor) {


        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / divisor) == 0) {
                list.add(arr[i]);
            }

        }
        if (list.size() == 0) return new int[]{-1};

        //list를 array로 바꾸고
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //sort한거 리턴
        Arrays.sort(answer);

        return answer;
    }

    public int[] check2(int[] arr, int divisor) {



            PriorityQueue<Integer> list = new PriorityQueue<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) list.add(arr[i]);
            }

            if(list.size() == 0) return new int[]{-1};

            // list를 Array로 바꾸고
            int[] answer = new int[list.size()];
            int idx = 0;
            while(!list.isEmpty()){
                answer[idx++] = list.poll();
            }
            return answer;
        }

}
