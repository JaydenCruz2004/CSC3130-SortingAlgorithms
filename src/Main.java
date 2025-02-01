import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArr = {64,34,25,12,22,11,90};

        //Bubble Sort
        Sortable bubble = new BubbleSort();
        int[] sortedBubble = bubble.sorty(unsortedArr);
        System.out.print("Bubble Sort: " +Arrays.toString(sortedBubble));

        //Insertion Sort
        Sortable insertion = new InsertionSort();
        int[] sortedInsertion = insertion.sorty(unsortedArr);
        System.out.print("\nInsertion Sort: " + Arrays.toString(sortedInsertion));

        //Selection Sort
        Sortable selection = new SelectionSort();
        int[] sortedSelection = selection.sorty(unsortedArr);
        System.out.print("\nSelection Sort: " + Arrays.toString(sortedSelection));

    }
}
