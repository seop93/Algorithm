package week8.Algorithm_1109;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{90,6,4,3,23,39};

        int i = 0;
        //arr[0] 번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0
        int minIdx = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]) minIdx = j;
        }
        int temp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

        i = 1;
        //arr[i]번째에 들어갈 깂 찾기
        // 그 값이 들어있는 찾기 -- 8
        //0 번은 정렬이 끝났기 때문에
        minIdx = 1;
        for (int j = 1; j < arr.length; j++) {
            if(arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
