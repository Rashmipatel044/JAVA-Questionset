
import java.util.Scanner;

public class O4_Array_on_string {


// Remove the element from the String recursively
static String remove_elements(String s, int i, char ch) {
    // Base Case
    if (i >= s.length()) {
        return "";
    }

    // Recursive Work
    String remainingString = remove_elements(s, i + 1, ch);

    // Self Work: Include current character if it's not 'ch'
    if (s.charAt(i) != ch) {
        return s.charAt(i) + remainingString;//Time complexity not constant its depens on n
    } else {
        return remainingString;
    }//Time complexity is O(n^2)
}
// SECOND LOGIC
static String removeA2(String s){
    if(s.length()==0)return "";
    String subans= removeA2(s.substring(1));//Time complexity depends on n
    if(s.charAt(0)!='a')
        return s.charAt(0)+subans;
        else
        return  subans;
}//Time complexity O(2n^2)==O(n^2)

// REVERSE OF A STRING

static String reverse(String str,  int i){
    String newstr="";
    if(i<0){
        return"";
    }
    newstr= reverse(str, i-1);
    return str.charAt(i)+newstr;
}
static boolean pallindron(String str1){
    String str2=reverse(str1, str1.length()-1);
    if(str1.equals(str2))
    return true;
    else return false;
}
// Another approch to find weather aa number is pallindron or not
static boolean palindromeA2(String str, int a, int l) {
    // Base Case: If pointers have crossed, it’s a palindrome
    if (a >= l) {
        return true;
    }

    // If characters at current positions don't match, return false
    if (str.charAt(a) != str.charAt(l)) {
        return false;
    }

    // Recursive call to check the remaining substring
    return palindromeA2(str, a + 1, l - 1);
}

static boolean str2fromstr1ornot(String str1, String str2, int i){
    if(i>=str2.length()) return true;
    char ch=str2.charAt(i);
    if(str1.indexOf(ch)==-1){
       return false;
    }
    return str2fromstr1ornot(str1, str2, i+1);
}
    public static void main(String[] args) {
        String s = "College";
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        // String s1= sc.next();
        String str=sc.nextLine();
        // String s2 = sc.nextLine();
        // // System.out.println("Next:"+s1);

        // System.out.println("Next Line:" + s2);
        // int n = s.length();// break at space
        // char ch = s2.charAt(0);
        // System.out.println(ch);
        // for (int i = 0; i < s.length(); i++)
        //     System.out.println(s2.charAt(i));
        // System.out.println(s2.substring(2, 4));// i to n-1
        // // If sub string range is out of boound then ERROR

        // // REmove the letter "a" from the String
        // String ans = "";
        // for (int i = 0; i < s2.length(); i++) {
        //     if (s2.charAt(i) != 'a')
        //         ans += s2.charAt(i);
        // }
        // System.out.println(ans);



        //RECURSIVE
       String newstr=remove_elements(str, 0, 'a');
       System.out.println(newstr);
       String newstr2=reverse(str, str.length()-1);
       System.out.println(newstr2);
       System.out.println("Pallindrone : "+pallindron(str));
    //    int n=str.length()-1;
    //    System.out.println("Pallindrone : "+pallindronA2(str,0,str.length()-1));
    System.out.println(str2fromstr1ornot("Present or not:"+newstr, "fguyj", 0));

    }
}
