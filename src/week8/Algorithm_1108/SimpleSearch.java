package week8.Algorithm_1108;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        sc.nextLine();
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.nextLine();
        int idx = 0;
        int k = sc.nextInt();

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] == k){
                idx = i + 1;
                break;
            }
        }
        System.out.println(idx);


    }
}
