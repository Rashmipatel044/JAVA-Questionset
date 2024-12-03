public class EmployeeFactory {

    // get the employee
 public static Employee getEmployee(String emptype){


  if(emptype.trim().equalsIgnoreCase("Android Developer"))
           {  return new AndroidDeveloper();}
  else if(emptype.trim().equalsIgnoreCase("web Developer"))
           return new WebDeveloper();

       else  {
           return null;
        }
 }

}
