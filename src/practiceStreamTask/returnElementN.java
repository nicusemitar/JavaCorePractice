package practiceStreamTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class returnElementN {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = IntStream.range(0,list.size())
                .filter(n -> n == 1)
                .mapToObj(list::get)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
