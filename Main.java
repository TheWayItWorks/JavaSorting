import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        int capacity = 100000;
        int[] testArray = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            testArray[i] = (int)Math.round(Math.random() * 100);
        }
        measureTime(() -> sorting(new QuickSort(),testArray));       //Qsort
        measureTime(() -> sorting(new SelectionSort(),testArray));   //selectionSort
        measureTime(() -> sorting(new BubbleSort(),testArray));      //Bubble-sort




    }
    public static void sorting(SortMethod sortMethod, int[] sortArray){
        int[] sorted = sortArray.clone();
        sortMethod.sort(sorted);
        System.out.println(" - "+sortMethod.getClass()+" -");
    }
    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms"+"\n");
    }
}
