public class Main{
    public static void main(String[] args) {

        System.out.println("Creatiing object using prototype design pattern");
        Networkconnection networkconnection=new Networkconnection();
        networkconnection.setIp("192.168.4.4");
        networkconnection.loadImportantData();
        System.out.println(networkconnection);
//new object of network connection

try{
 Networkconnection networkconnection2= (Networkconnection) networkconnection.clone();
 Networkconnection networkconnection3= (Networkconnection) networkconnection.clone();

 System.out.println(networkconnection);
 networkconnection2.getDomains().remove(0);
 System.out.println(networkconnection2);
 System.out.println(networkconnection3);
}catch(CloneNotSupportedException e){
e.printStackTrace();
}
     /*
      * OUTPUT
      Creatiing object using prototype design pattern
192.168.4.4:Very very Important Data:[www.elizabethrashmi044, www.apple.com, www.orange.com]
192.168.4.4:Very very Important Data:[www.elizabethrashmi044, www.apple.com, www.orange.com]
192.168.4.4:Very very Important Data:[www.apple.com, www.orange.com]
192.168.4.4:Very very Important Data:[www.apple.com, www.orange.com]
this is shallow copying
      */
    
}}