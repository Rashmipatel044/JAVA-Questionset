// input -array and number upto rotate
// 12345
// if k=1 51234
// if k=2 45123

import java.util.Scanner;

public class C13_rotateupton {

    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] reverseuptok(int[]arr, int k){

        int n= arr.length;
        k=k%n;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
         ans[j++]=arr[i];

        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
    public static void main(String[]args){
        System.out.println("Enter your array");
        Scanner sc= new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your upto rotation part");
        int k=sc.nextInt();
        int ans[]=reverseuptok(arr,k);
        printarray(ans);
    }
}
