import java.util.Scanner;

public class Boundryrectanglesum {

    // Function to calculate sum using prefix sum matrix
    static int rectanglesum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Function to compute the prefix sum matrix
    static void findprefixsum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        // Compute horizontal prefix sum (row-wise)
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // Compute vertical prefix sum (column-wise)
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    // Function to calculate the sum of a rectangle using the prefix sum matrix
    static int rectanglesum2(int[][] arr, int r1, int c1, int r2, int c2) {
        findprefixsum(arr);

        // Get the sum of the submatrix using the prefix sum formula
        int sum = arr[r2][c2];

        if (r1 > 0) {
            sum -= arr[r1 - 1][c2];
        }

        if (c1 > 0) {
            sum -= arr[r2][c1 - 1];
        }

        if (r1 > 0 && c1 > 0) {
            sum += arr[r1 - 1][c1 - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the dimensions of the matrix
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];

        // Input for the matrix elements
        System.out.println("Enter the " + r * c + " elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for the rectangle boundaries
        System.out.println("Enter the starting row (r1) of the rectangle:");
        int r1 = sc.nextInt();
        System.out.println("Enter the starting column (c1) of the rectangle:");
        int c1 = sc.nextInt();
        System.out.println("Enter the ending row (r2) of the rectangle:");
        int r2 = sc.nextInt();
        System.out.println("Enter the ending column (c2) of the rectangle:");
        int c2 = sc.nextInt();

        // Validation to ensure the input boundaries are valid
        if (r1 < 0 || c1 < 0 || r2 >= r || c2 >= c || r1 > r2 || c1 > c2) {
            System.out.println("Invalid rectangle boundaries.");
        } else {
            // Calculate the sum using both methods
            int ans1 = rectanglesum(arr1, r1, c1, r2, c2);
            int ans2 = rectanglesum2(arr1, r1, c1, r2, c2);

            System.out.println("Sum of the elements in the rectangle (without prefix sum): " + ans1);
            System.out.println("Sum of the elements in the rectangle (using prefix sum): " + ans2);
        }
    }
}
