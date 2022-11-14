package week9;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;

            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }

            System.out.print(arr[i] + " ");

        }
    }
}



