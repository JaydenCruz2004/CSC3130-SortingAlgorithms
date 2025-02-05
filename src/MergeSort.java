public class MergeSort implements Sortable {
    @Override
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(int[] input, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(input, left, middle);
            mergeSort(input, middle + 1, right);
            merge(input, left, middle, right);
        }
    }

    private void merge(int[] input, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArray[i] = input[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = input[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                input[k] = leftArray[i];
                i++;
            } else {
                input[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
