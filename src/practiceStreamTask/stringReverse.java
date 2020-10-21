package practiceStreamTask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stringReverse {
    public static String stringReverse(String string) {
        return Arrays.asList(string).stream()
                .map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList()).get(0);
    }
    public static void main(String[] args) {
        //2
        System.out.println(stringReverse("Stream Practice"));
    }
}
