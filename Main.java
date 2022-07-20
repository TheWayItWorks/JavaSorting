import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        int[] testArray = {2, 4, 66, 4, 3, 23, 5, 330,4,4,0,1};

        sorting(new BubbleSort(),testArray);                                      //BubbleSort

        sorting(new SelectionSort(),testArray);                                    //Selection sorting

    }



    public static void sorting(SortMethod sortMethod, int[] sortArray){
        int[] sorted = sortArray.clone();
        sorted = sortMethod.sort(sorted);
        System.out.println(Arrays.toString(sorted)+" - "+sortMethod.getClass());
    }
}
