import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArr = {64,34,25,12,22,11,90};

        //Bubble Sort
        Sortable bubble = new BubbleSort();
        int[] sortedBubble = bubble.sorty(unsortedArr);
        System.out.print(Arrays.toString(sortedBubble));

        //Insertion Sort
        Sortable insertion = new InsertionSort();
        int[] sortedInsertion = insertion.sorty(unsortedArr);
        System.out.print(Arrays.toString(sortedInsertion));


    }
}
