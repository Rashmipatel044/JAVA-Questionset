 class Student{
String Name;
int age;

Student(String name, int age){
    this.Name= name;
    this.age= age;

}


public void printInfo1(String name){
    System.out.println(Name);
}

private int printInfo1(int Age){
return age;
}

public void printInfo1(String name, int age){
    System.out.println("Name : "+ Name+"Age :"+age);
}

public void printInfo1(){
System.out.println(printInfo1(age));
}
}






public class Polymorphism_FunctionOverloading {
    public static void main(String[] args) {
   Student s1= new Student("Shyam",43);
//    s1.Name="RAm";
//    s1.age=89;

//  If it is set through s1.Name, s1.age then priotise this one not Student("Shyam, 43")
   s1.printInfo1(s1.Name); 
   s1.printInfo1();
   s1.printInfo1(s1.Name,s1.age );    
    }
}
