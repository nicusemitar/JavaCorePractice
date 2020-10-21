package practiceStreamTask;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args) {

        //7
        List<Integer> listOfIntegers = Arrays.asList(17, 1, 52, 3, 63, 3, 4, 52, 6, 36, 6, 17, 8, 1);
        System.out.println(listOfIntegers);
        System.out.println();

        List<Integer> listWithoutDuplicates = listOfIntegers.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("List Without Duplicates: " + listWithoutDuplicates);

        //Second method
        Set<Integer> setWithoutDuplicates = new TreeSet<>(listOfIntegers);
        System.out.println("Set Without Duplicates: " + setWithoutDuplicates);

        //Third version
        Map<Integer, Integer> elementCountMap = listOfIntegers.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));

        System.out.println("Count Element: " + elementCountMap);

    }
}
