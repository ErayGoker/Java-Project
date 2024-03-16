import java.util.ArrayList;
import java.util.Stack;



public class App {
   public static ArrayList <Integer> array=new ArrayList<Integer>();
    
    public static void main(String[] args) throws Exception {
           
            double a = System.currentTimeMillis();
           
            Thread eray=new Thread(new Runnable() {

            @Override
            public void run() {
               for (int i = 2; i < 10000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                  array.add(i);
                }
                if (i % j == 0) {
                    break;
                }  

            }
        }
            }
            
           });

           Thread yasmin=new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < array.size(); i++) {
           System.out.println(array.get(i));
        }
            }
            
           });

           eray.start();
           yasmin.sleep(1);

           yasmin.start();

           eray.join();
           yasmin.join();
           
            double b = System.currentTimeMillis();
           System.out.println(b-a);
           

           
            
           
    }

    




}

