

class PostOfficeBank{
 public String name;
 protected String email;
  
 private String password;


 public String getpassword(){
    return password;
 }
 
public void setpassword(String pwd){
    this.password= pwd;
}

}

public class Encapsulation{
        public static void main(String[] args) {
    
            PostOfficeBank user1= new PostOfficeBank();
            user1.name="RAshmi";
            user1.email="Elizabethrashmi044";
            user1.setpassword("Apple");
            System.out.println(user1.getpassword());
            



    }
}