
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        
       LinkedList <String> liste= new LinkedList<String>();
       liste.add("ankara");
              liste.add("istanbul");
       liste.add("eskisehir");
       liste.add("bursa");

       ListIterator <String> point= liste.listIterator();

       Sehirler gez=new Sehirler(point);

       gez.ileriSehriGoster();
              gez.ileriSehriGoster();


       gez.ileriSehriGoster();
       gez.ileriSehriGoster();
       System.out.println("-----");
     gez.geriSehriGoster();
          gez.geriSehriGoster();
          System.out.println("----");
        gez.ileriSehriGoster();



    }
    
}
