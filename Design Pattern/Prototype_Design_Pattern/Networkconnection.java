import java.util.ArrayList;
import java.util.List;

public class Networkconnection implements Cloneable {
 
    private String ip;
    private String importantData;

    private List<String>domains=  new ArrayList<>();
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getImportantData() {
        return importantData;
    }
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }


    public void loadImportantData(){
        this.importantData="Very very Important Data";
    domains.add("www.elizabethrashmi044");
    domains.add("www.apple.com");
    domains.add("www.orange.com");
       
        //It takes 5 minite
    }
    public List<String> getDomains() {
        return domains;
    }
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
    @Override
    public String toString() {
        return this.ip+":"+this.importantData+":"+this.domains;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
      Networkconnection networkconnection= new Networkconnection();
      networkconnection.setIp(this.getIp());
      networkconnection.setImportantData(this.getImportantData());
      for(String d:this.getDomains()){
        networkconnection.getDomains().add(d);
      }
        return networkconnection;
    }

}
