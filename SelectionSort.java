import java.util.Arrays;

public class SelectionSort implements SortMethod{

    @Override
    public int[] sort(int[] nonSort) {

        for (int i = 0; i < nonSort.length; i++) {
            System.out.println(Arrays.toString(nonSort) +" step "+i);
            int minIndex =min(nonSort,i);
            int temp = nonSort[i];
                nonSort[i] = nonSort[minIndex];
                nonSort[minIndex] = temp;




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
