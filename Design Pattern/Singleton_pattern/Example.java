import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example {
    public static void main (String[] args)throws Exception  {
        // new Apple();

        Apple apple1=Apple.getApple();
        System.out.println(apple1.hashCode());
        Apple apple2=Apple.getApple();
          System.out.println(apple2.hashCode());

          System.out.println(Orange.getorange().hashCode());
          System.out.println(Orange.getorange().hashCode());


        /*
        1. reflaction API to break singleton pattern
           solution-> a.if object exist throw Exception from inside constructor
                b.use enum
        2. Deserialization
            Solution-> Implementation readResolve methods

         3. Clone

        
        */ 
  Apple a1= Apple.getApple();
  System.out.println(a1.hashCode());

//   Constructor<Apple> constructor=Apple.class.getDeclaredConstructor();
//   constructor.setAccessible(true);
//   Apple a2= constructor.newInstance();
//   System.out.println(a2.hashCode());

Appleenum ae1= Appleenum.IINSTANCE;
System.out.println(ae1.hashCode());
Appleenum.IINSTANCE.display();

Apple apple = Apple.getApple();
System.out.println(apple.hashCode()); // Prints hash code of the Singleton instance

// Serialization
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
oos.writeObject(apple);
oos.close();
System.out.println("Serialization done...");

// Deserialization
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
Apple a2 = (Apple) ois.readObject(); // Creates a new instance during deserialization
ois.close();
System.out.println(a2.hashCode()); // Different hash code from 'apple' (Singleton broken)



Apple a21=(Apple) apple.clone();
System.out.println(a21.hashCode());
    }
}
