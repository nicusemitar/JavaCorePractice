package practiceStreamTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class minAndMaxNumber {
    public static void main(String[] args) {
        //5
        List<Integer> arrayOfIntegers = Arrays.asList(234, 532543, 343, 543, 865, 353, 654);
        Integer minNumber = Collections.min(arrayOfIntegers);
        Integer maxNumber = Collections.max(arrayOfIntegers);

        System.out.println("Max number: " + maxNumber + "\nMin number: " + minNumber);
    }
}
