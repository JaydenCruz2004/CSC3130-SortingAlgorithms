public class BubbleSort implements Sortable {
 @Override
    public int[] sorty(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap arr[j] and arr[j+1] swap part of bubble sort
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }

            }
        }
        return arr;
    }
}

