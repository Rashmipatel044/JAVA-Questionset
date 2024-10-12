import java.util.Scanner;

public class twoDarray {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
          }   System.out.println(" _______________________");
       

    }
    static void swap(int[][]arr,int a, int b ) {
           int temp= arr[a][b];
            arr[a][b]= arr[b][a];
           arr[b][a]=temp;
    }

static void reverse(int[]arr){
   int i=0,j=arr.length-1;
   while(i<j){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
   }
}
    
    // Addition Function

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("wrong Input");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("ADDITION");
        printarray(sum);
    }

    // MULTIPLICATION FUNCTION

    static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }
        int mul[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {

                    mul[i][j] += (a[i][k] + b[k][j]);

                }
            }

        }
        System.out.print("MULTIPLICATION");
        printarray(mul);

    }
    // TRANSPOSE BY USING EXTRA AYYAY
static void transpose(int[][]arr,int r,int c ){
    int [][]ans= new int[c][r];
    for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
         ans[i][j]=arr[j][i]; 
       }
    }
    System.out.println("TRANSPOSE");
    printarray(ans);


}
// TRANSPOSE WITHOUT USING EXTRA ARRAY

static void transposewithoutnew(int[][]arr, int r, int c){
     for(int i=0;i<r;i++){
        for(int j=i;j<c;j++){
           if(arr[j][i]!=arr[i][j]){
            swap(arr, i, j);
           }
        }
     }
     System.out.println("TRANSPOSE WITHOUT NEW ARRAY");
}

static void reverseby90degreee(int[][]arr,int r, int c){
     transposewithoutnew(arr, r, c);
     for(int i=0;i<r;i++){
      reverse(arr[i]);
     }
     
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of column");
        int c1 = sc.nextInt();
        System.out.println("Enter the number of rows");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of column");
        int c2 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the " + r1 * c1 + "elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the " + r1 * c1 + "elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        printarray(arr1);
        printarray(arr2);
        add(arr1, r1, c1, arr2, r2, c2);
        multiplication(arr1, r1, c1, arr2, r2, c2);
        transpose(arr2, r2, c2);
        transposewithoutnew(arr1,c1,r1);
    reverseby90degreee(arr2, r2, c2);
    System.out.println("ROATED MATRIX");
    printarray(arr2);
    }
}
