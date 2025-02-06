import java.util.Random;

public class KTester {
    private Sortable sa;

    public KTester(Sortable sa) {
        this.sa = sa;
    }

    public static int[] generateKSorted(int[] arr) {
        int n = arr.length;
        for (int gap = n / 10; gap > 0; gap = 0) {
            //Insertion sort for each gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    public double singleTest(int size) {
        int[] arr = new int[size];
        Random gen = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = gen.nextInt();
        }
        arr = KTester.generateKSorted(arr);
        long startTime = System.currentTimeMillis();
        sa.sorty(arr);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public double test(int iterations, int size) {
        double totalTime = 0.0;

        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        double avgTime = totalTime / iterations;

        return avgTime;
    }
}

