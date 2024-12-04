public class Main {
    public static void main(String[] args) {
       User user= new User.UserBuilder().setEmailId("Apple@gmail.com").setUserId("USER!23").setUserName("RAshmi").build();
    
    System.out.println(user);
    
    }
}
