// REVERSE AN ARRAY WHILE CREATING A NEW ARRAY
import java.util.Scanner;
public class Challange10{


    static void printarray(int[]arr){
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
   }
   System.out.println();
    }

  static int[] reverse(int[]ar){
    int[]ans=new int[ar.length];
    int j=0;
    for(int i=ar.length-1;i>=0;i--){
           ans[j++]=ar[i];

    }
    return ans;
  }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int ar[]= new int[5];
        System.out.print("Enter your array");
        for(int i=0;i<5;i++){
          ar[i]=sc.nextInt();
        }
         int []ans1= reverse(ar);
          printarray(ans1);
    }
}