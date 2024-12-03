public class DeveloperClient {
    public static void main(String[] args) {
        

        // Employee employee= new AndroidDeveloper();// Tightly couppled

       Employee emp= EmployeeFactory.getEmployee("Android Developer");
System.out.println(emp.salary());
    }
}
