import java.util.HashMap;

public class AnagramOrNor {

static HashMap<Character,Integer>makeFreqMap(String str){
HashMap<Character,Integer> mp= new HashMap<>();
for(int i=0;i<str.length();i++){
    Character ch= str.charAt(i);
    if(!mp.containsKey(ch)){
        mp.put(ch, 1);
    }
    else{
        int currfreq= mp.get(ch);
        mp.put(ch, currfreq+1);
    }
}
return mp;
}
 public static boolean AnagramOrNot(String s1, String s2){

    if(s1.length()!=s2.length())return false;
  HashMap<Character,Integer> mp1= makeFreqMap(s1);
  HashMap<Character,Integer> mp2= makeFreqMap(s2);

  return mp1.equals(mp2);
 }

    public static void main(String[] args) {
        System.out.println(AnagramOrNot("Appldse","Appel"));
    }
}
