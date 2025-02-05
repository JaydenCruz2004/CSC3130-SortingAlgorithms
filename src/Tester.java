import java.io.Console;
import java.util.Random;

public class Tester {
    public static Console print;
    private Sortable sa;

    //Constructor
    public Tester(Sortable sa) {
        this.sa = sa;
    }

    public double singleTest(int size) {
        int[] arr = new int[size];
        Random gen = new Random();
        //fill the array with random #'s
        for (int i = 0; i < size; i++) {
            arr[i] = gen.nextInt();
        }

        //start time
        long startTime = System.currentTimeMillis();
        //sort the array
        sa.sorty(arr);
        // end time
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public double test(int interations, int size) {
        double totalTime = 0.0;

        for (int i = 0; i < interations; i++) {
            totalTime += singleTest(size);
        }
        double avgTime = totalTime / interations;

        return avgTime;
    }
}
