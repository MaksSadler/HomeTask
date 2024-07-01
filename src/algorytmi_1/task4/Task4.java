package algorytmi_1.task4;

public class Task4 {
//Фибоначчи с рекурсией.
    public static int fibbRec(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        return fibbRec(n-1) + fibbRec(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibbRec(10));
    }
}
