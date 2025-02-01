public class ShellSort implements Sortable {
    @Override
    public int[] sorty(int[] arr) {
        int n = arr.length;
        for(int gap =n/2; gap > 0; gap /= 2) {
            //Insertion sort for each gap
            for(int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for(j = i; j >= gap && arr[j-gap] > temp; j-=gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
