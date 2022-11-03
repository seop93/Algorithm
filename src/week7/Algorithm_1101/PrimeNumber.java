package week7.Algorithm_1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class PrimeNumber {


    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            // 위에 3가지 예재에서 다른 점은 가운데 실행문이므로 이자리에 넣어준다.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a*a < b;
            }
        });

    }
}
