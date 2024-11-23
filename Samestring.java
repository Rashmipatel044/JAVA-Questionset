public class Samestring {
    public static void main(String[] args) {
        String str="geekforgeeks";
        for(int i=0;i<str.length()-1;i++){
           char  str1=str.charAt(i);
            for(int j=1;j<str.length()-1;j++){
                if(str1!=str.charAt(j)){
                    continue;
                }
                    else
                    System.out.println(str.charAt(j));
                    return;
            }
        }
    }
}
