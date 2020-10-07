package practiceTask1;/*
Author: Semitar Nicolae
JAVA AM Intern
 */
import java.util.Scanner;

public class Java_Core_Second_Task {
    public static void main(String[] args) {
        //Second Task
        Scanner scString = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inputString = scString.nextLine();

        char[] tryToChar = inputString.toCharArray();
        for (int i = tryToChar.length - 1; i >= 0; i--)
            System.out.print(tryToChar[i]);

        // As well a smart solution
        /* StringBuilder sbr = new StringBuilder();
        sbr.append(inputString);
        System.out.println(sbr.reverse()); */
    }

}
