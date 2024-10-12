import java.util.Scanner;

public class C17_evenatleft {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] squareincreasing(int[]arr){
        int n= arr.length;
        int k=0;
        int left=0,right=0;
        int []ans= new int[n];
        while(left<=right){
        if(Math.abs(arr[left])>Math.abs(arr[right])){
               ans[k++]=arr[left]*arr[left];
               left++;
        }else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }

    }
    return ans;


    }
    static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    static void sorted(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer forward if the value is even
            if (arr[left] % 2 == 0) {
                left++;
            }
           
            else if (arr[right] % 2 != 0) {
                right--;
            }
            // If left is odd and right is even, swap them
            else if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for the array:");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        // sorted(arr);
        int[] ans= squareincreasing(arr);
        System.out.println("Array after sorting:");
        printArray(ans);
     
    }
}

