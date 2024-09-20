import java. util.Scanner;
public class Challange09 {
 // noumber of pairs whose sum is equal to target

 static int targetSum(int []arr,int x){
    int count=0;
    for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.length;j++){
       if(arr[i]+arr[j]==x)
          count= count+1;
     }
    }
    return count;
 }
  public static void main(String[]args){
    System.out.print("Enter the target");
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
    int arr[]= new int[10];
    for(int i=0;i<10;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(targetSum(arr,x));
  }
}
