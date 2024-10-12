// SORT THE ARRAY HAVING 0 AND 1 BY USING 2 POINTERS

// input the array
// two pointers i.e., left and right
// check l and R and initilize left with zero and right with 1
// left++ and right--
// if l and R are ok i.e., 0 and 1 then left++ and right--
// continue the process upto left<right

import java.util.Scanner;

public class C16_sort01by2pointer {
    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
static void swap(int[]arr,int left,int right){
    int temp=arr[right];
    arr[right]=arr[left];
    arr[left]=temp;
}
    static void sorted(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
        if(arr[left]==1 &&arr[right]==0){
            swap(arr,left,right);
          left++;
          right--;
            
        }
        if(arr[left]==0){
            left++;
            
        }
        if(arr[right]==1){
            right--;
        }
    }
    }

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR ARRAY IN EITHER 0 oR 1");
        int []arr= new int[10];
        for(int i=0;i<10;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(arr[3]);
        sorted(arr);
         printarray(arr);
    }
}
