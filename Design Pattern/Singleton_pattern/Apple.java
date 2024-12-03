import java.io.Serializable;

public class Apple implements Serializable,Cloneable {

    private static Apple apple;
    // Constructor

    private Apple() {
        if (apple != null) {
            throw new RuntimeException("You are trying to break the Singleton pattern!");
        }
    }
    
//   LAZY METHOD

    public static Apple getApple() {
        // object of class

       
            synchronized(Apple.class){ 
                if (apple == null) {
                apple = new Apple(); 
            }
           
        }
        return apple;
    }
 
    public Object readResolve(){
        return apple;
    }
@Override
    public Object clone() throws CloneNotSupportedException{
        return apple;
    }

}

// private constructor
// object created with the hellp of object
// create field to store object is private
