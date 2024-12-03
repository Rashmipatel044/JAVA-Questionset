package ABSTRACT_factory_Design_pattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
return factory.creatEmployee();
    }
    
}
