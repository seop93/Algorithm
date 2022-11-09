package week7.Algorithm_1102;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public int eratosthenes(int N) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }
        for (int j = 2; j*j< N ; j++) { //2의 배수 지우기 2제외
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) % j == 0 && list.get(i) > j) list.remove(i);
            }
        }



//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0 && list.get(i) > 2) list.remove(i);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 3 == 0 && list.get(i) > 3) list.remove(i);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 4 == 0 && list.get(i) > 4) list.remove(i);
//        }
        return list.size();
    }

    public static void main(String[] args) {
        RemoveMultipleOf rm = new RemoveMultipleOf();
        System.out.println(rm.eratosthenes(50));


    }
}
