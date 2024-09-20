import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class q1 {

    public static int get_ans(int N, List<List<Integer>> A) {
        // Initialize maximum possible sum of beauties
        int maxSumOfBeauties = 0;

        // Convert List<List<Integer>> to int[][]
        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = A.get(i).get(j);
            }
        }

        // Iterate over all possible sub-grids
        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < N; y1++) {
                for (int x2 = 0; x2 < N; x2++) {
                    for (int y2 = 0; y2 < N; y2++) {
                        if (isNonIntersecting(x1, y1, x2, y2, N)) {
                            int beauty1 = calculateBeauty(grid, x1, y1);
                            int beauty2 = calculateBeauty(grid, x2, y2);
                            maxSumOfBeauties = Math.max(maxSumOfBeauties, beauty1 + beauty2);
                        }
                    }
                }
            }
        }

        return maxSumOfBeauties;
    }

    // Function to check if two sub-grids are non-intersecting
    private static boolean isNonIntersecting(int x1, int y1, int x2, int y2, int N) {
        // For simplicity, assuming each sub-grid is of size 1x1.
        // For larger sub-grids, additional checks for overlapping would be needed.
        return (x1 != x2 && y1 != y2);
    }

    // Function to calculate the beauty of a sub-grid
    private static int calculateBeauty(int[][] grid, int x, int y) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i = x; i < x + 1; i++) {
            for (int j = y; j < y + 1; j++) {
                maxVal = Math.max(maxVal, grid[i][j]);
                minVal = Math.min(minVal, grid[i][j]);
            }
        }

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;

        try {
            N = Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input for grid size.");
            return;
        }

        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = scan.nextLine().trim();
            if (!line.isEmpty()) {
                A.add(
                    Arrays.stream(line.split("\\s+"))
                          .map(Integer::parseInt)
                          .collect(Collectors.toList())
                );
            } else {
                System.err.println("Invalid input for grid row.");
                return;
            }
        }

        int result = get_ans(N, A);
        System.out.println(result);
        scan.close();
    }
}
