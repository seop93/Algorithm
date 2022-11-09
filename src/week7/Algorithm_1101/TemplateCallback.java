package week7.Algorithm_1101;

public class TemplateCallback {
    boolean isPrime(int num){
        for (int i = 2; i < num ; i++) {
            if(num % i != 0) return false;
        }

        for (int i = 2; i < num / 2 ; i++) {
            if(num % i != 0) return false;
        }

        for (int i = 2; i < num ; i++) {
            if(num % i != 0) return false;
        }

        return true;
    }
}
