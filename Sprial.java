import java.util.Scanner;

public class Sprial {

    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
          }  
       

    }

    static void printspiralorder(int[][]arr,int r, int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            // left row -> left col to rightcol
            for(int j=0;j<=rightcol && totalElements<r*c;j++){
                System.out.print(arr[toprow][j]+" ");
                totalElements++;
            }
            toprow++;
            // right colom-> toprow to bottomrow
            for(int i=0;i<=bottomrow && totalElements<r*c;i++){
                System.out.print(arr[i][rightcol]+" ");
                totalElements++;
            }
            rightcol--;
            // bottom row->rightcol to leftcol
            for(int i=rightcol;i>=leftcol && totalElements<r*c;i--){
                System.out.print(arr[bottomrow][i]+" ");
                totalElements++;
            }bottomrow--;
            // left col->bottomrow to toprow
            for(int i=bottomrow;i>=toprow && totalElements<r*c;i--){

                System.out.print(arr[i][leftcol]+" ");
                totalElements++;
            }leftcol++;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of column");
        int c1 = sc.nextInt();
  

        int[][] arr1 = new int[r1][c1];
      
        System.out.println("Enter the " + r1 * c1 + "elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }        printspiralorder(arr1,r1,c1);
        printarray(arr1);
        

    }

}
