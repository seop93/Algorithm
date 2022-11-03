package week7.Algorithm_1102;

public class SpeedPrime {
    public void isPrime(int N) {
        int[] arr = new int[N];
        boolean[] check = new boolean[N];
        for (int i = 0; i < N; i++) {

                arr[i] = (i + 1) * 2;

        }

        for(int arrs : arr){
            System.out.println(arrs);
        }

    }

    public static void main(String[] args) {
        SpeedPrime sp = new SpeedPrime();
        sp.isPrime(10);
    }


}
