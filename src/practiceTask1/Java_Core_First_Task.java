package practiceTask1;/*
Author: Semitar Nicolae
JAVA AM Intern
 */

import java.util.Scanner;

public class Java_Core_First_Task {
    public static void main(String[] args) {
        // First task
        Scanner scInt = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int n = scInt.nextInt();
        if (n > 1000) {
            System.out.println("You entered a number large than 1000");
        } else if (n < 0) {
            System.out.println("You entered a number less than 0");
        }
        int firstD = n % 10;
        n = n / 10;

        int secondD = n % 10;
        n /= 10;

        int thirdD = n % 10;
        n /= 10;

        int fourthD = n % 10;

        int sumAllD = firstD + secondD + thirdD + fourthD;
        System.out.println("The sum of all digits is: " + sumAllD);
        int i;

    }
}

