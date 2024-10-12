import java.util.Scanner;

public class Generatespiralmatrix {

    // Function to print the 2D array
    static void printarray(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to fill the array in a spiral manner
    static void spiralconsecutive(int[][] arr, int n) {
        int toprow = 0, rightcol = n - 1, bottomrow = n - 1, leftcol = 0;
        int count = 1;
        int totalcount = 0;

        while (totalcount < n * n) {
            // Traverse the top row from leftcol to rightcol
            for (int i = leftcol; i <= rightcol && totalcount < n * n; i++) {
                arr[toprow][i] = count++;
                totalcount++;
            }
            toprow++; // Move down to the next row

            // Traverse the right column from toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalcount < n * n; i++) {
                arr[i][rightcol] = count++;
                totalcount++;
            }
            rightcol--; // Move left to the next column

            // Traverse the bottom row from rightcol to leftcol
            for (int i = rightcol; i >= leftcol && totalcount < n * n; i--) {
                arr[bottomrow][i] = count++;
                totalcount++;
            }
            bottomrow--; // Move up to the next row

            // Traverse the left column from bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalcount < n * n; i--) {
                arr[i][leftcol] = count++;
                totalcount++;
            }
            leftcol++; // Move right to the next column
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER N:");
        int n = sc.nextInt();
        int[][] ans = new int[n][n];
        spiralconsecutive(ans, n);
        printarray(ans, n, n);
    }
}
