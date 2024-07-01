package algorytmi_1.test6;

import java.util.Date;

public class Test6 {

    public static void test() {
        for (int i = 10; i <= 45; i++) {
            Date start = new Date();
            fibbRec(i);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            findFibb(i);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("n: %d, rec: %d, lin: %d\n", i, time1, time2);
        }
    }

    public static int fibbRec(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        return fibbRec(n-1) + fibbRec(n-2);
    }

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
        test();
    }
}
