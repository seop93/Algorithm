package week6.algorithm_1024;

import java.util.Arrays;

public class UseSort {

    //Arrays.copyOfRange()
    public int[] kSort(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands){
            int[] sliceArr = Arrays.copyOfRange(array, command[0]-1,command[1]);//array를 slice합니다
            Arrays.sort(sliceArr); //정렳합니다.
            answer[idx++] = sliceArr[command[2]-1]; //정렬한 Array의 idx번째를 뽑습니다.
        }


        return answer;
    }


    public static void main(String[] args) {
        UseSort useSort = new UseSort();
        int[] array={1, 5, 2, 6, 3, 7, 4};
        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer=useSort.kSort(array, commands);
        System.out.println(Arrays.toString(answer));

    }
}
