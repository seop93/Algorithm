package week6.algorithm_1028;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Pokemon2 {
    public int solution(int[] nums){

        //중복제거를 위해 set 사용
        Set<Integer> numSet = new HashSet<>();
        int  max = nums.length/2;

        for(int num : nums){
            numSet.add(num);
        }

        //중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 numSet의 size를 리턴
        if(numSet.size() > max){
            return max;
        } else{
            return numSet.size();
        }
    }


}
