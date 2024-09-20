
// BINARY TO DECIMAL


import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
        }
        for (int j = 0; j < n; j++) {
            sum += arr[n - 1 - j] * Math.pow(2, j);
        }
        System.out.println("DEcimal:"+sum);
        System.out.print("Apple");
        sc.close();
    }
}
