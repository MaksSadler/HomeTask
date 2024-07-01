package algorytmi_1.task3;

public class Task3 {

    public static int combSum1(int n) {
        //k = 4 - ограниченное кло-во кубиков.;
        int count = 0;
        //Решение полчилось O(n^4) стпени.
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    for (int d = 1; d <= n; d++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int combSum2(int k, int n) {
        if (k > 0)
            return combSum2Rec(1, k, n);
        return 0;
    }

    public static int combSum2Rec(int h, int k, int n) {
        if (h == k + 1)
            return 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += combSum2Rec(h + 1, k, n);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(combSum1(6));
        System.out.println(combSum2(4, 6));
    }
}
