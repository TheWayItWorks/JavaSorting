public class BubbleSort implements SortMethod {
    @Override
    public int[] sort(int[] nonSort) {                         //BubbleSorting improved

             boolean sorted = false;
             while (!sorted) {
                 sorted = true;
                 for (int i = 0; i < nonSort.length - 1; i++) {
                     int first = nonSort[i];
                     int second = nonSort[i + 1];
                     if (first > second) {
                         int temp;
                         temp = first;
                         nonSort[i] = second;
                         nonSort[i + 1] = temp;
                         sorted = false;
                     }
                 }
             }


        return nonSort;
    }
}
