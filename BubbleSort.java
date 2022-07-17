public class BubbleSort implements SortMethod {
    @Override
    public int[] sort(int[] nonSort) {                         //BubbleSorting

        for (int j = 0; j < nonSort.length; j++) {

            for (int i = 0; i < nonSort.length-1; i++) {
                int first = nonSort[i];
                int second = nonSort[i+1];
                if (first>second){
                    int temp;
                    temp = first;
                    nonSort[i] = second;
                    nonSort[i+1] =temp;
                }
            }

        }
        return nonSort;
    }
}
