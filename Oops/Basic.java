// Define the Pen class separately
class Pen {
    String name;
    String type;

    public void write() {
        System.out.println("Write Something!!");
    }

    public void type() {
        System.out.println("Write something in " + this.type);
    }
}

class Student{
    String name;
    int age;
    void  printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


//     Student(String name, int age)
// {

//     this. name= name;
//     this.age= age;
// }

Student(){

}
Student(Student s){
    this.name= s.name;
    this.age= s.age;
}
}

public class Basic {

    public static void main(String[] args) {
        // Create an instance of Pen
        // Pen pen1 = new Pen();
        // pen1.name = "Xyx";
        // pen1.type = "Ball";
        // pen1.write();
        // pen1.type();
        // Pen pen2= new Pen();
        // pen2.name="dfa";
        // pen2.type="gel";
        // pen1.type();
        // pen2.type();
        Student s1= new Student();
        s1.name="RAsha";s1.age=54;



   Student s2= new Student(s1);
   s2.printInfo();
    }
}
