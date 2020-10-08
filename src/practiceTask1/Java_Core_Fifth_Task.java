package practiceTask1;

import java.util.Arrays;
import java.util.Scanner;

/*
Author: Semitar Nicolae
JAVA AM Intern
 */
public class Java_Core_Fifth_Task {

    // recursie
//    public static int factorial(int n) {
//        if (n <= 1)
//            return 1;
//        int fact = n * factorial(n - 1);
//        return fact;
//    }

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
    // metoda auxiliara recursiva
    private static void recsort(int[] arr, int k) {
        if (k == 1)
            return;
        // recursie
        recsort(arr, k - 1);
        if (arr[k - 1] <= arr[0]) {
            reverse(arr, k - 1);
            reverse(arr, k);
        }
        else if (arr[k - 1] >= arr[k - 2])
            return;
        else {
            reverse(arr, k);
            int i = 1;
            while (arr[0] < arr[i])
                i++;
            reverse(arr, i);
            reverse(arr, i - 1);
            reverse(arr, k);
        }
    }

    public static int[] sort(int[] arr) {
        recsort(arr, arr.length);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scn.nextInt();

        // a)
        reverse(array, 5);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // b)
        array = sort(array);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}



