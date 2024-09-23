// REVERSE AN ARRAY WITHOUT INITILIZING A NEW ARRAY

import java.util.Scanner;

public class C12_reverse {

    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reverse(int[]arr){
        int j=arr.length-1;
      for(int i=0;i<arr.length/2;i++){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j--]=temp;
        
      }
    

    }
    public static void main(String[] args) {
        System.out.print("ENTER YOUR ARRAY");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <5; i++) {
            arr[i] = sc.nextInt();
        }
   reverse(arr);
    printarray(arr);
    }
}
