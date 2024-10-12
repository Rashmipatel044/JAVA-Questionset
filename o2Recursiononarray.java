import java.util.Scanner;

public class o2Recursiononarray {

    // Recursive function to print the elements of an array
    static void printarray(int[] arr, int i) {
        // Base case: when the index goes beyond the last element
        if (i == arr.length) {
            return;
        }
        // Self work: print the current element
        System.out.print(arr[i] + " ");

        // Subproblem: recursive call for the next index
        printarray(arr, i + 1);
    }

    static int maximum(int[] arr, int i) {

        if (i == arr.length - 1) {
            return arr[i];
        }
        int smallans = maximum(arr, i + 1);
        // self work
        return Math.max(arr[i], smallans);

    }
  
    static int minimum(int[] arr, int i) {
        // Base case
        if (i == arr.length - 1)
            return arr[i];
    
        // Recursive call
        int subans = minimum(arr, i + 1);
    
        // Compare current element with the result of the recursive call
        return Math.min(arr[i], subans);
    }
    
    static int sum_of_elements(int[] arr, int i) {
        // Base case
        if (i == arr.length - 1)
            return arr[i];
        // Sub problem
        int sbans = sum_of_elements(arr, i + 1);
        // Self work
        return sbans + arr[i];
    }

    static boolean target_present_or_not(int[] arr, int i, int x) {
        // Base case
        if (i >= arr.length) {

            return false;
        }
        // Self work
        if (arr[i] == x)
            return true;
        // sub problem
        if (target_present_or_not(arr, i + 1, x)) {
            return true;
        } else
            return false;

    }
// FIRST INDEX
    static int target_position(int[]arr, int i, int x)
{
    // Base Case
    if(i>=arr.length)
    return -1;
    // Self work
    if(arr[i]==x)
    return i+1;
    // sub proble\m
    return target_position(arr, i+1, x);
}

static int lastIndex_of_target(int[]arr, int x,int i){
// Base case
          if(i<0)
          return -1;
      // self work
        if(arr[i]==x)
        return i+1;
        // Subproblem
        return lastIndex_of_target(arr, x, i-1);

  
}
// RETURN ALL ITHE INDEXES WHERE TARGET IS PRESENT
static void findallindexes(int[]arr, int i, int x){
    if(i>=arr.length)return;  //base case
    //self work
    if(arr[i]==x)
    System.out.print((i+1)+" ");
    // Sub problem
    findallindexes(arr, i+1, x);
  
}

static boolean is_sorted(int[] arr, int i) {
    // Base case: If we reach the last element, the array is sorted
    if (i == arr.length - 1)
        return true;

    // Check if the current element is smaller than the next one
    if (arr[i] > arr[i+1])
        return false;

    // Recursively check the rest of the array
    return is_sorted(arr, i+1);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of the array:");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        printarray(arr, 0);
        System.out.println("Maximum" + maximum(arr, 0));
        System.out.println("Minimum" + minimum(arr, 0));
        System.out.println("Sum of the elements" + sum_of_elements(arr, 0));
        System.out.println(target_present_or_not(arr, 0, 20));
        System.out.println("First Occurance "+target_position(arr, 0, 20));
        System.out.println("LastOccurance "+lastIndex_of_target(arr, 20, 4));
        System.out.println("Sorted or not "+is_sorted(arr, 0));
        findallindexes(arr, 0, 20);
    }
}