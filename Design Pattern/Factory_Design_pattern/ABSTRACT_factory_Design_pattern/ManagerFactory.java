package ABSTRACT_factory_Design_pattern;

public class ManagerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee creatEmployee(){
        return new Manager();
    }
}
