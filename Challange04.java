
//Converting Decimal Number into Binary
import java.util.Scanner;
public class Challange04 {
    public static void main(String[] args) {
        System.out.print("Repo Test");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Decimal number");
        int a =sc.nextInt();
       int r=0;
        while(a!=0){
             r=a%2;
            a=a/2;
            System.out.print(r);
            
        }
String octalStr=Integer.toOctalString(r);
System.out.print("Octal:"+octalStr);

String hexastr=Integer.toHexString(r);
System.out.println("Hexal:"+hexastr);


sc.close();
    }
}
