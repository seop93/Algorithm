package week8.Algorithm_1109;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface SortStrategy {
    boolean compare(int a, int b);

    //interface선언하고
    //template callback 패턴 적용
}


public class SelectionSort {
    public int[] solution(int[] arr, SortStrategy stmt) {
        int swapIdx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.compare(arr[swapIdx], arr[j])) {
                    swapIdx = j;
                    arr[0] = arr[swapIdx];
                    int temp = arr[i];
                    arr[i] = arr[swapIdx];
                    arr[swapIdx] = temp;

                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{90, 6, 4, 3, 23, 39};

        int i = 0;
        //arr[0] 번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0
        int minIdx = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[minIdx] > arr[j]) minIdx = j;
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
            if (arr[minIdx] > arr[j]) minIdx = j;
        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));


        int[] arr2 = new int[]{4, 35, 6, 34, 8, 7, 85, 20};
        SelectionSort ss = new SelectionSort();
        System.out.println(Arrays.toString(ss.solution(arr2, (a, b) -> a < b)));
        ss.solution(arr2, (a, b) -> a < b);

        Function<Integer[], Boolean> fn = arr3 -> arr3[0] > arr3[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;

    }
}
