package ABSTRACT_factory_Design_pattern;

public class WebDevFactory  extends EmployeeAbstractFactory{
    @Override
    public Employee creatEmployee(){
        return new WebDeveloper();
    }
    
}
