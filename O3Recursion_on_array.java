import java.util.ArrayList;

public class O3Recursion_on_array {

    static ArrayList<Integer> allIndecies(int[] arr, int n, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Base case
        if (idx >= n)
            return ans;// return empty arraylist
        // Self work

        if (arr[idx] == target) {
            ans.add(idx + 1);
        }

        // Sub problem
        ArrayList<Integer> smallans = allIndecies(arr, n, target, idx + 1);
        ans.addAll(smallans);
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 3, 4 };
        int target = 4;
        int n = arr.length;

        ArrayList<Integer> ans = allIndecies(arr, n, target, 0);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
