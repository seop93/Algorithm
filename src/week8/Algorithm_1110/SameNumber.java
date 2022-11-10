package week8.Algorithm_1110;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SameNumber {
    public int[] solution(int[] arr){

        List<Integer> list = new ArrayList<>();
        int num = -1; // 0~9 까지 숫자만 나오기 때문에 초기값은 이 값들에게 영향을 안받는 값

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                list.add(arr[i]);
                num = arr[i];
            }
        }
        int[] noSame = new int[list.size()]; //리스트 크기만큼 배열을 선언
        for (int i = 0; i < list.size(); i++) {
            noSame[i] = list.get(i);
        }
        return noSame;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,3,2,2,2,1,5,5};
        SameNumber sn = new SameNumber();
        sn.solution(arr);
    }
}
