import java.util.ArrayList; 
public class O5recursion_on_string {

    static ArrayList<String>getssq(String s){
        ArrayList<String> ans= new ArrayList<>();
        // Base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        // Recursive problem
        // Self work
    char ch= s.charAt(0);
    ArrayList<String> smallans= getssq(s.substring(1));
    for(String ss:smallans){
        ans.add(ss);
        ans.add(ch+ss);
    }
    return ans;
    }

    // SECOND APPROCH  *****BEST APPROCH*****


    static void printssq(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char currchar=s.charAt(0);
        String remString= s.substring(1);
        printssq(remString, currAns+currchar);
        printssq(remString, currAns);
    }

//  ********IMPORTANT********
// Print the sum of the sub set of an array
static void Sumofsubset(int[]a,int n, int i, int sum){
    if(i>=n){
        System.out.println(sum);
        return;
    }
    Sumofsubset(a, n, i+1, sum+a[i]);
    Sumofsubset(a, n, i+1, sum);
}

    public static void main(String[] args) {
        ArrayList<String>ans= getssq("abc");
        for(String ss:ans)
        System.out.println(ss);
        System.out.println(" _________________________");
        printssq("abc", "");
        System.out.println("______________________");
        int[]a={2,4,5};
        Sumofsubset(a, a.length, 0, 0);
    }
}
