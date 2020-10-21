package practiceStreamTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class stringNumbersConvertToIntegers {
    public static void main(String[] args) {
        //4
        List<String> stringListlist = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> newIntegersList = stringListlist.stream()
                .map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(newIntegersList);
    }
}



