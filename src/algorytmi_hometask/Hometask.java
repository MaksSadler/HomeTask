package algorytmi_hometask;

public class Hometask {

    public static void main(String[] args) {
        int[] array = {1000, 5, 7, 3, 2, 500, 13, 19, 123, -5};
        heapSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array,i,n);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array,0,i);
        }
    }

    private static void heapify(int[] array, int i, int n) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < n && array[l] > array[largest]) {
            largest = l;
        }
        if (r < n && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array,largest,n);
        }
    }
}
