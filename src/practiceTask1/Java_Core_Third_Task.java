package practiceTask1;/*
Author: Semitar Nicolae
JAVA AM Intern
 */

public class Java_Core_Third_Task {
    // Third Task Method
    public boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int original = num;
        int reversed = 0;
//   another possibility to solve     int remainder;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
//   another possibility to solve         remainder = num % 10;
//   another possibility to solve       reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        // Third Task
        Java_Core_Third_Task a = new Java_Core_Third_Task();
        System.out.println(a.isPalindrome(1221));
        System.out.println(a.isPalindrome(-1221));
        System.out.println(a.isPalindrome(01221));
        System.out.println(a.isPalindrome(12211));
    }
}
