
//CONVERT BINARY INTO DECIMAL,OCTAL,HEXADECIMAL

import java.util.Scanner;
public class Challange02 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a binary number:");
        String binaryStr = sc.nextLine();
        
        int decimal = Integer.parseInt(binaryStr,2);//BASE:2
        System.out.println("The Decimal equivalent is:"+decimal);
       
        String octalStr = Integer.toOctalString(decimal);
        System.out.println("The octal equivalent is: " + octalStr);

        String hexastr=Integer.toHexString(decimal);
        System.out.println("The Hexa equivalent"+hexastr);
        
        sc.close();
    }
    
}


        

