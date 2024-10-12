
import java.util.Scanner;
public class Pascal {

    static void printarray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
            System.out.println(" _______________________");
        }
    }

    static int[][] pascal(int n){
         int[][]ans=new int[n][];
           for(int i=0;i<n;i++){
            // ith row has i+1 column
            ans[i]=new int[i+1];
            // ist and last element is 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
           }

         return ans;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
      System.out.print("ENter your Number of rows");
      int n= sc.nextInt();
int[][]ans=pascal(n);
printarray(ans);
    }
}
