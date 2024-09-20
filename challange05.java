import java.util.Scanner;
// public class challange05 {
//     public static void main(String[] args) {
//         System.out.print("Occurances of a particular number");
//         int i,j,count=0;
//         int arr[]=new int[10];
//         // int arr[] ={10,3,3,54,2};

//         System.out.print("Enter the number to target");
//         Scanner sc= new Scanner(System.in);
//         int num=sc.nextInt();
//         System.out.print("Enter the elements of array");
//         for(j=0;j<7;j++){
//             arr[j]=sc.nextInt();
//         }
//         for( i=0;i<arr.length;i++){
//             if(arr[i]==num)
//             count++;

//         }
//         System.out.println("Total number of element"+count);
//     }

// }
//                                     FUNCTION 

public class challange05 {
    static int countoccurance(int []arr,int num){
        int count=0;
        for (int i=0;i<arr.length;i++){
               if(arr[i]==num)
               count++;

        }
        return count;
    }

    public static void main(String[]args){
        System.out.print ("Enter the targeted number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("Enter the array");
        int[]arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Count of num is"+countoccurance(arr, num));

    }
}