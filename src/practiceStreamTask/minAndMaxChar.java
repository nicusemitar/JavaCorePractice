package practiceStreamTask;

import java.util.Comparator;
import java.util.stream.Stream;

public class minAndMaxChar {
    public static void main(String[] args) {

        //6
        Character maxChar = Stream.of('S', 'T', 'R', 'E', 'A', 'M')
                .max(Comparator.comparing(String::valueOf))
                .get();

        Character minChar = Stream.of('S', 'T', 'R', 'E', 'A', 'M')
                .min(Comparator.comparing(String::valueOf))
                .get();

        System.out.println("Min Char: " + minChar + "\nMax Char: " + maxChar);
    }
}
