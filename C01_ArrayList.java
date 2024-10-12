// WRAPPPER CLASS
/*
 * a class whose object contains or wraps premitive data type
 * object of a wapper class contain a field which stores pdt.
 * 
 */


import java.util.ArrayList; // Import java.util.ArrayList

public class C01_ArrayList{ // Renamed the class to avoid conflict
    public static void main(String[] args) {
        Integer a = Integer.valueOf(4);
        System.out.println(a);

        // Use the ArrayList from java.util package
        ArrayList<Integer> l1 = new ArrayList<>(); 
        l1.add(10);
        l1.add(20);
        l1.add(30);

        // get an element
        System.out.println(l1.get(0));
        // print with loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        // printing the list directly
        System.out.println("ArrayList elements: " + l1);   //[10,20,30]


        // adding element at some Index i [10,100,20,30]
       l1.add(1,100);
       System.out.println(l1);

    //    modifying element at index i
       l1.set(1,200);//[10,200,20,30]
       System.out.println(l1);

    //    remove an element at index i
    l1.remove(1);
    System.out.println(l1);//[10,20,30]

// remove an element
System.out.println("abcd"+l1.remove(Integer.valueOf(30)));// return boolean data type

System.out.println(l1);
// remove an element which doesnt exist in list
l1.remove(Integer.valueOf(40));
System.out.println("def"+l1);
    //NO ERROR


l1.add(30);
l1.add(40);
l1.add(50);
System.out.println(l1);

// check weather a element is present or not
boolean ans= l1.contains(Integer.valueOf(30));
System.out.println(ans);
boolean ans2= l1.contains(Integer.valueOf(300));
System.out.println(ans2);


ArrayList l= new ArrayList();
l.add("rashmi");
l.add(30);
l.add(true);
l.add(6.4);
System.out.println(l);
System.out.println(l.contains("rashmi"));
System.out.println(l.contains(false));

System.out.println(l1.indexOf(20));//first occurance
System.out.println(l1.lastIndexOf(10));  //last occurence

    }
}
