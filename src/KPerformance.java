import java.io.FileWriter;
import java.io.PrintWriter;

public class KPerformance {

    public static void main(String[] args) {
        int[] arraySizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;
        Sortable[] sortingAlgorithms = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new ShellSort(),
                new QuickSort(),
                new MergeSort()
        };

        try {
            FileWriter file = new FileWriter("kperformance_report.txt");
            PrintWriter print = new PrintWriter(file);

            for (Sortable algorithm : sortingAlgorithms) {
                print.println("\nSorting Algorithm -> " + algorithm.getClass().getSimpleName());
                System.out.println("\nSorting Algorithm -> " + algorithm.getClass().getSimpleName());

                KTester kTester = new KTester(algorithm);


                // Test with 10-sorted data
                for (int size : arraySizes) {
                    double avgTime = kTester.test(iterations, size);
                    print.println("Sorted " + size + " elements in " + avgTime + "ms (avg) - 10-Sorted");
                    System.out.println("Sorted " + size + " elements in " + avgTime + "ms (avg) - 10-Sorted");
                }
            }
            print.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

