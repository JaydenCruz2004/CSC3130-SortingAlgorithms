public class Main {
    public static void main(String[] args) {
        int[] unsortedArr = {64,34,25,12,22,11,90};

        Sortable bubble = new BubbleSort();
        int[] sortedArr = bubble.sort(unsortedArr);

        for(int s : sortedArr) {
            System.out.print(s + " ");
        }
    }
}
