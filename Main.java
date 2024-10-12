import java.util.*;
import java.io.*;

public class Main {
    static class Interval {
        long start, end;

        Interval(long start, long end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // Handle the edge case where there are no intervals.
        if (n == 0) {
            System.out.println(0);
            return;
        }

        Interval[] intervals = new Interval[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            intervals[i] = new Interval(Long.parseLong(input[0]), Long.parseLong(input[1]));
        }

        // Sort the intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingLong(a -> a.start));

        long low = 0, high = 10000000000L, result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canPlace(intervals, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }

    static boolean canPlace(Interval[] intervals, long distance) {
        long lastPlaced = intervals[0].start;

        for (int i = 1; i < intervals.length; i++) {
            // Ensure the next placement is within the current interval's boundaries.
            if (intervals[i].end - lastPlaced >= distance) {
                lastPlaced = Math.max(lastPlaced + distance, intervals[i].start);
            } else if (intervals[i].start - lastPlaced < distance) {
                // If even starting point of the current interval is too close to lastPlaced, return false.
                return false;
            }
        }

        return true;
    }
}