package practiceTask1;

import java.util.Scanner;

/*
Author: Semitar Nicolae
JAVA AM Intern
 */
public class Java_Core_Fifth_Task {

    public static void reverse(int[] arr, int k) {
        if (k <= 1)
            return;
        if (k > arr.length)
            k = arr.length;
        int aux;
        for (int i = 0; i < k / 2; i++) {
            // arr[i] <=> arr[k - i - 1]
            aux = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scn.nextInt();

        // a)
        reverse(array, 5);
    }
}
