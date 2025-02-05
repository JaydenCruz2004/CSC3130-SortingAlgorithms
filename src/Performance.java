import java.io.FileWriter;
import java.io.PrintWriter;

public class Performance {

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
            FileWriter file = new FileWriter("performance_report.text");
            PrintWriter print = new PrintWriter(file);

            for (Sortable algorithm : sortingAlgorithms) {
                print.println("\nSorting Algorithm -> " + algorithm.getClass().getSimpleName()); // Writing to .txt
                System.out.println("\nSorting Algorithm -> " + algorithm.getClass().getSimpleName());


                Tester tester = new Tester(algorithm);

                for (int size : arraySizes) {

                    double avgTime = tester.test(iterations, size);
                    //write to the .txt
                    print.println("Sorted " + size + " elements in " + avgTime + "ms (avg)");
                    //print to the console
                    System.out.println("Sorted " + size + " elements in " + avgTime + "ms (avg)");

                }
            }
            print.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
