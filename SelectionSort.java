public class SelectionSort implements SortMethod{

    @Override
    public int[] sort(int[] nonSort) {

        for (int i = 0; i < nonSort.length; i++) {
            int minIndex =min(nonSort,i);
            int minValue = nonSort[minIndex];
            if (nonSort[i]>minValue){
                int temp = nonSort[i];
                nonSort[i] = minValue;
                nonSort[minIndex] = temp;

            }


        }
        return nonSort;
    }
    private int min(int[] arr, int startPosition){
        int minValue = arr[startPosition];
        int minIndex = startPosition;
        for (int i = startPosition+1; i < arr.length; i++) {
            if (arr[i]<minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
