import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        int[] testArray = {2, 4, 66, 4, 3, 23, 5, 330,4,4,0,1};

        sorting(new BubbleSort(),testArray);                                    //Bubblesort
        sorting(new SelectionSort(),testArray);                                    //Selection sorting

    }


    public static void sorting(SortMethod sortMethod, int[] sortArray){
         int[] sorted = sortMethod.sort(sortArray);
        System.out.println(Arrays.toString(sorted)+" - "+sortMethod.getClass());
    }
}
