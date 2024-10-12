import java.util.Scanner;

public class PrefixSum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;

       arr[0] = arr[0];  
        for (int i = 1; i < n; i++) { 
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Input array: ");
        printArray(arr);

        System.out.print("Prefix Sum Array: ");
        int[] ans = makePrefixSumArray(arr);
        printArray(ans);
    }
}