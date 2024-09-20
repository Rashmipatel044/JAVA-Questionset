import java.util.*;
public class challange08{
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
      StringBuilder str= new StringBuilder(sc.nextLine());
      int  i;
      String wr = "";
      StringBuilder nLine = new StringBuilder();
      for(i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if (!Character.isWhitespace(ch)){
          wr+=ch;

        }
else {
    nLine.append(new StringBuilder(wr).reverse().toString());
    nLine.append(ch);
    wr = "";
      
    }
System.out. println(nLine);
}sc.close();
}}