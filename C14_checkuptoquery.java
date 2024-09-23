// CHECK WEATHER A NUMBER IS PRESENT OR NOT UPTO A QUERY
// Input the array
// Input the number of query
// create a frequency array
    //    Initilise the zero and increses at the index where the value is present
// check the value if greater than zero then yes or else no

import java.util.Scanner;

public class C14_checkuptoquery {

    static int[] frequenctarray(int[]arr){
        int []fecq=new int[1000004];
      for(int i=0;i<arr.length;i++){
           fecq[arr[i]]++;
      }
      return fecq;

    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int[]arr= new int[10];
        System.out.println("Enter the array");
        for(int i=0;i<10;i++){
         arr[i]=sc.nextInt();
        }
       int []ans=frequenctarray(arr);
       System.out.print("Enter the number of query");
       int q=sc.nextInt();
    while( q>0){
        System.out.println("Enter the element to search");
        int sq=sc.nextInt();
        if(ans[sq]>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        q--;
    }
    
    }
}
