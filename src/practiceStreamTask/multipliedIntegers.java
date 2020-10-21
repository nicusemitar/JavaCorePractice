package practiceStreamTask;

import java.util.Arrays;
import java.util.List;

public class multipliedIntegers {
    public static void main(String[] args) {
        //1
        List<Integer> listOfIntegers = Arrays.asList(2, 4, 6, 8, 10, 20, 30, 100, 200);
        listOfIntegers.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}
