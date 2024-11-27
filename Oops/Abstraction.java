abstract class Animal{
    abstract void walk();
   public void eat(){
    System.out.println("animals eat");
   }

   Animal(){
    System.out.println("Created an animal");
   }
}

class Horse extends Animal{

    Horse(){
System.out.println("created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.walk();
    }
}
