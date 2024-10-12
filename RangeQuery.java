import java.util.Scanner;

public class RangeQuery {
    

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];  
      
        for (int i = 1; i < n; i++) { 
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
   
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.print("Input Array: ");
        printArray(arr);
        
    
        int[] prefixSum = makePrefixSumArray(arr);
        
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        
        while (q-- > 0) {
            System.out.print("Enter range (l r): ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            
           
            int ans;
            if (l == 1) {
                ans = prefixSum[r - 1];
            } else {
                ans = prefixSum[r - 1] - prefixSum[l - 2];
            }

            System.out.println("Sum: " + ans);
        }

        sc.close();
    }
}
