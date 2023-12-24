import java.util.PriorityQueue;
import java.util.Queue;


public class App {
    public static void main(String[] args) throws Exception {
            Queue <Hasta> hastasirasi=new PriorityQueue<Hasta>();
                
            hastasirasi.offer(new Hasta("eray", "bas agrisi"));
            hastasirasi.offer(new Hasta("eray", "karin agrisi"));
            hastasirasi.offer(new Hasta("eray", "ameliyat"));
            hastasirasi.offer(new Hasta("eray", "is kazasi"));
            hastasirasi.offer(new Hasta("eray", "araba kazasi"));

            while(!hastasirasi.isEmpty()){
                System.out.println(hastasirasi.poll());
                System.out.println("-------------------");
            }

            
    }
}
