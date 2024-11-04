import java.util.Arrays;

public class SelectionsortTest {
    Integer[] a;

    // Constructor
    public SelectionsortTest(Integer[] a) {
        this.a = a;
    }

    // Selection sort method
    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; min_idx = " 
                    + min_idx +
                    "; cur_min = " 
                    + a[min_idx] 
                    +"; " 
                    + Arrays.deepToString(a)
                );
            }
            swap(i, min_idx);
        }
    }

    // Swap method to exchange elements
    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        System.out.println("Initial Array: " + Arrays.deepToString(array));

        SelectionsortTest sorter = new SelectionsortTest(array);
        sorter.selectionSort();

        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}