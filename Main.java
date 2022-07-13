import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = (reader.readLine().split(" "));
        List<Integer> ints = new ArrayList(stringToInt(strings));
        System.out.println(ints);
        new Bublesort().sort();




    }

    public static List stringToInt(String[] strings){     //Convert array of strings to List of int's
        List<Integer> ints = new ArrayList();
        for (int i = 0; i < strings.length; i++) {
            ints.add(Integer.parseInt(strings[i]));
        }
        return ints;
    }
}
