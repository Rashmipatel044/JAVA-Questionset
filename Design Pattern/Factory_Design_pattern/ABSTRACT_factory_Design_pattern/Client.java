package ABSTRACT_factory_Design_pattern;



public class Client {
    public static void main(String[] args) {
          Employee ep1=  EmployeeFactory.getEmployee(new AndroidDevFactory());
          System.out.println(ep1.name());
          System.out.println(ep1.salary());
          Employee ep2=  EmployeeFactory.getEmployee(new WebDevFactory());
          System.out.println(ep2.name());
          System.out.println(ep2.salary());
          Employee ep3=  EmployeeFactory.getEmployee(new ManagerFactory());
          System.out.println(ep3.name());
          System.out.println(ep3.salary());
    }

}
