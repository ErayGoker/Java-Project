
import java.util.*;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap <Integer ,String> hashmap=new HashMap<Integer ,String>();
 long baslangic= System.currentTimeMillis();
        hashmap.put(10, "eray");
        hashmap.put(20, "yasmin");
        hashmap.put(30, "nilay");
        hashmap.put(40, "nilufer");
        hashmap.put(50, "ayhan");
        hashmap.put(60, "hasan");
 long bitis= System.currentTimeMillis();
        System.out.println(hashmap.get(10));
       
        for ( Map.Entry<Integer,String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey()+"--------"+entry.getValue());
        }
       
        hashmap.containsValue(hashmap);
        System.out.println(bitis-baslangic);


      
              



    }
}
