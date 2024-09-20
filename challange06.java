import java.util.Scanner;
public class challange06 {
    static int lastOccurance(int[]arr,int num){
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
            p=i;
             
        }
       return p;
    }
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number");
        int num=sc.nextInt();
        System.out.print("Enter your Array");
        int []arr=new int[10];
        for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();

        }
        System.out.print("LAst Occeurance of a number"+ lastOccurance(arr,num));
    }
}
