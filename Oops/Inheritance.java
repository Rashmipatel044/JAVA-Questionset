class Shape{
    String color;
    public void area(){
        System.out.println("Print Area");
    }
}
class Triangle extends Shape{
    public void area(int l, int b){
        System.out.println(1/2*b*l);
    }
} 

class Equilater extends Triangle{
    public void area(int l, int b){
        System.out.println(l*b);
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.color="Red";
        Triangle tr= new Triangle();
        tr.color="pink";
        tr.area(2,3);
        Equilater er= new Equilater();
        er.color="green";
        er.area(3,4);
        er.area();
        

    }
}
