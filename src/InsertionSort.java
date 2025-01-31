public class InsertionSort implements Sortable {
    @Override
    public int[] sorty(int[] arr) {
        for (int p = 1; p < arr.length; ++p) {
            int tmp = arr[p];  // Element to be inserted
            int j = p;

            while (j > 0 && arr[j - 1] > tmp) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = tmp;
        }

        return arr;
    }

}
