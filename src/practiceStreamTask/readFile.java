package practiceStreamTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class readFile {
    public static void main(String[] args) {

        //8
        String readFileName = "C:\\Users\\NSemitar\\OneDrive - ENDAVA\\Desktop\\filetoread.txt";

        try (Stream<String> stream = Files.lines(Paths.get(readFileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


