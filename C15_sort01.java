// SORT THE ARRAY WHIC HAVE ONLY 0 AND 1

// Enter the array
// left side zero and right side one
// cout zero put on left upto zero count
// Rest -one

import java.util.Scanner;

public class C15_sort01 {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void sorted(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = count + 1; i < arr.length; i++) {
            arr[i] = 1;
        }
        while (count >= 0) {
            arr[count] = 0;
            count--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR ARRAY EITHER 0 OR 1");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sorted(arr);
        printarray(arr);
        sc.close();
    }
}
