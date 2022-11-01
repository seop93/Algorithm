package week7;

public class PrimeNumber {
    public boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;

        }

        return true;
    }


    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        System.out.println(pn.isPrime(13));
    }
}
