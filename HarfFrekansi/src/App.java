import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

public class App {
    public static void main(String[] args) throws Exception {
            
            Scanner input=new Scanner(System.in);

        System.out.print("cumleyi giriniz : ");
        String cumle=input.nextLine();
        
        TreeMap <Character ,Integer> agac=new TreeMap<Character,Integer>();

        for (int i = 0; i < cumle.length(); i++) {
            char karakter=cumle.charAt(i);

            if(agac.containsKey(karakter)){
                System.out.println("========");
               agac.replace(karakter, (agac.get(karakter)+1));
            }
            else{
                agac.put(karakter, 1);
            }
        }



        for ( Map.Entry<Character ,Integer> sirala : agac.entrySet()) {

                System.out.println("harf : "+ sirala.getKey() +" frekansi : "+ sirala.getValue());
        }


    }
}
