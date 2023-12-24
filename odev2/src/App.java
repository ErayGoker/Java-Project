public class App {
    public static void main(String[] args) throws Exception {

        double a = System.currentTimeMillis();
        

        producerConsume asal = new producerConsume();

        Thread bul = new Thread(new Runnable() {

            @Override
            public void run() {
                asal.producer();
            }

        });

        Thread yaz = new Thread(new Runnable() {

            @Override
            public void run() {
               asal.conseme();
            }

        });


        bul.start();
        yaz.start();

        
        bul.join();
        yaz.join();

        double b = System.currentTimeMillis();
        System.out.println(b-a);
        

    }
}
