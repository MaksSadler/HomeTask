package algorytmi_1.task5;

public class Task5 {
    //Решение задачи фибоначчи с массивами.

    public static int findFibb(int n) {
        final int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for (int i=3; i<=n; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(findFibb(10));
    }
}
