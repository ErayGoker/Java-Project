import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random= new Random();

        int pideSayisi=random.nextInt(10)+1;
       

        Queue <String> kuyruk=new LinkedList<String>() ;

        kuyruk.offer("yasmin");
        kuyruk.offer("eray");
        kuyruk.offer("nilay");
        kuyruk.offer("nilufer");
        kuyruk.offer("ayhan");
        kuyruk.offer("hasan");
        kuyruk.offer("mert");
        kuyruk.offer("kaan");
        kuyruk.offer("mevsim");
        kuyruk.offer("eylul");

        System.out.println("Pideler cikiyor...");
        System.out.println(pideSayisi + " pide cikmistir");
        Thread.sleep(3000);

        for (int i = 1; i <= pideSayisi; i++) {
          System.out.println(kuyruk.poll()+" Pidesini almistir");  
          Thread.sleep(1000);
        }


    }
}
