public class O7Recursion_Keypadcombination {


    static void combination(String dig,String[]kp, String res){
if(dig.length()==0){
    System.out.println(res+"");
    return;
}
int currnum=dig.charAt(0)-'0';
String currChoice=kp[currnum];

for(int i=0;i<currChoice.length();i++){
    combination(dig.substring(1), kp, res+currChoice.charAt(i));
}

    }
    public static void main(String[] args) {
        String s="23";
        // kp[7]="pqrs"
        String[]kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //          0   1   2    3      4     5    6      7      8     9

        combination(s, kp, "");
    }
}
