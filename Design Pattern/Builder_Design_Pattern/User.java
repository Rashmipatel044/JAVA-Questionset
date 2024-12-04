class User{
    private final String userId;
    private final String UserName;
    private final String emailId; 
    private User(UserBuilder builder){
//Initilization
 this.userId=builder.userId;
 this.UserName=builder.UserName;
 this.emailId=builder.emailId;
        
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return UserName;
    }
    
    public String getEmailId() {
        return emailId;
    }
@Override
    public String toString() {
        return this.UserName+":"+this.emailId+":"+this.userId;
    }

    //INner Class to create Object

    static class UserBuilder{
        private String userId;
        private  String UserName;
        private String emailId;
        public UserBuilder(){

        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            UserName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        } 

        public User build(){
            User user= new User(this);
            return user;
        }
    }


}