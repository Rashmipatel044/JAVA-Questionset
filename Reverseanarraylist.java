
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Reverseanarraylist {
  
    static void reverse(ArrayList<Integer> l){
     int e=l.size()-1;
     for(int i=0;i<e;i++){
        int temp= Integer.valueOf(l.get(i));
        l.set(i, l.get(e));
        l.set(e,temp);
        // l.set(i)=Integer.valueOf(l.get(e));    ERROR
        // l.set(e)=temp;               ERROR
        
        e--;
     }

    }
    public static void main(String[] args) {
          ArrayList<Integer> l=new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the elements of the array"); 
    for(int i=0;i<5;i++){
        
        l.add(sc.nextInt());
    }
    System.out.println(l);
    reverse(l);
    System.out.println(l);
//  INBUILT
    Collections.reverse(l);
    System.out.println(l);

    Collections.sort(l);
    System.out.println(l);

Collections.sort(l,Collections.reverseOrder());
System.out.println(l);

ArrayList <String>l1= new ArrayList<>();
  l1.add("Apple");
  l1.add("banana");
  l1.add("afkfdfl");
  l1.add("dhfas");
  System.out.println(l1);
  Collections.sort(l1);
  System.out.println("Sorted List");
  System.out.println(l1);
  Collections.sort(l1,Collections.reverseOrder());
  System.out.println(l1);


    }
 

}
