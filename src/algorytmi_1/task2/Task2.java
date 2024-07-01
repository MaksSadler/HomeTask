package algorytmi_1.task2;

import java.util.ArrayList;

public class Task2 {

    public static ArrayList<Integer> fyndSimpleNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 2; i <= n; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> fyndSimpleNumbers = fyndSimpleNumbers(100);
        for (Integer i : fyndSimpleNumbers) {
            System.out.println(i);
        }
    }
}
