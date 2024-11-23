import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicHashMap{
public static void main(String[] args) {
    HashMap<String,Integer>mp= new HashMap<>();
    //Insert the data
    mp.put("Aman",7);
    mp.put("Radha",47);
    mp.put("Shyam",27);

    mp.put("Ram",71);
    mp.put("Rohan",97);
    System.out.println(mp);//{Shyam=27, Aman=7, Radha=47, Ram=71, Rohan=97} UNORDERED
    //Insertion if key already stored
    mp.put("Don", 47);
    System.out.println(mp);//{Shyam=27, Don=47, Aman=7, Radha=47, Ram=71, Rohan=97} 47 is not the key
    mp.put("Radha",105);
    System.out.println(mp);//{Shyam=27, Don=47, Aman=7, Radha=105, Ram=71, Rohan=97} updated radha from 47 to 105
    System.out.println(mp.get("Radha"));//105
    System.out.println(mp.get("hgcds"));//null
    System.out.println(mp.remove("Don"));//47
    System.out.println(mp.remove("Don"));//null
    System.out.println(mp.containsKey("Don"));//false
    mp.putIfAbsent("Ram", 89);//no effect because Ram is already present
    System.out.println(mp.keySet());//[Shyam, Aman, Radha, Ram, Rohan]
    System.out.println(mp.values());//[27, 7, 105, 71, 97]
    System.out.println(mp.entrySet());//[Shyam=27, Aman=7, Radha=105, Ram=71, Rohan=97]
//TRAVERSING THE HASHMAP

//Method 1
for (String e : mp.keySet()) {
            System.out.printf("The value of %s is %d\n", e, mp.get(e));
        }

        //Method 2
        for(Map.Entry<String,Integer> m:mp.entrySet()){
          System.out.println(m);
        }
        //Method 3
        for(var e:mp.entrySet()){
            System.out.println(e);
        }
HashMap<String, Integer> ap = new HashMap<>();
Scanner sc = new Scanner(System.in);

for (int i = 0; i < 5; i++) {
    System.out.println("Enter key (String): ");
    String key = sc.nextLine();
    System.out.println("Enter value (Integer): ");
    int value = sc.nextInt();
    sc.nextLine(); 
    ap.put(key, value);
}

System.out.println(ap);

}
}