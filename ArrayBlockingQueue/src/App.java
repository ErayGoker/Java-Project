public class App {
    public static void main(String[] args) throws Exception {
        ProducerConsumer pc= new ProducerConsumer();

        Thread producer =new Thread(new Runnable() {

            @Override
            public void run() {
                pc.produce();
            }
            
        });

         Thread consume =new Thread(new Runnable() {

            @Override
            public void run() {
                pc.consume();
            }
            
        });

        producer.start();
        consume.start();
        try {
                
            producer.join();
            consume.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
