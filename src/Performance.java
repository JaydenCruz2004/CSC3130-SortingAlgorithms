import java.io.FileWriter;
import java.io.PrintWriter;

public class Performance {

    public static void main(String[] args) {
        int[] arraySizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;
        Sortable[] sortingAlgorithms = {
                new BubbleSort(),
                new InsertionSort(),
                new ShellSort(),
                new SelectionSort(),
                new MergeSort(),
                new QuickSort(),
        };


        try {
            FileWriter file = new FileWriter("performance_report.text");
            PrintWriter print = new PrintWriter(file);

            for (Sortable algorithm : sortingAlgorithms) {
                System.out.println("\nSorting Algorithm -> " + algorithm.getClass().getName());

                Tester tester = new Tester(algorithm);

                for (int size : arraySizes) {
                    tester.test(iterations, size);

                }
            }
            print.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
