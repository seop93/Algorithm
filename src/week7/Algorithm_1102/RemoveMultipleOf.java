package week7.Algorithm_1102;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public List<Integer> eratosthenes(int N) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) > 2) list.remove(i);
        }

        return list;
    }

    public static void main(String[] args) {


    }
}
