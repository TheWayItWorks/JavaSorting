import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = (reader.readLine().split(" "));
        int[] ints = stringToInt(strings);
        System.out.println(Arrays.toString(ints));
        sorting(new BubbleSort(),ints);

    }

    public static int[] stringToInt(String[] strings){     //Convert array of strings to List of int's
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
    public static void sorting(SortMethod sortMethod, int[] sortArray){
         int[] sorted = sortMethod.sort(sortArray);
        System.out.println(Arrays.toString(sorted)+" - "+sortMethod.getClass());
    }
}
