package practiceTask1;/*
Author: Semitar Nicolae
JAVA AM Intern
 */

import java.util.Scanner;

public class Java_Core_Fourth_Task {
    public static void main(String[] args) {
        // Fourth Task
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter something: ");
        String str = scn.nextLine();
        int cntl = 0;
        int cntn = 0;
        int cnts = 0;
        int cnto = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' ')
                cnts++;
            else if (Character.isLetter(ch))
                cntl++;
            else if (Character.isDigit(ch))
                cntn++;
            else
                cnto++;
        }
        System.out.println("Letters: " + cntl);
        System.out.println("Spaces: " + cnts);
        System.out.println("Numbers: " + cntn);
        System.out.println("Other: " + cnto);
    }
}
