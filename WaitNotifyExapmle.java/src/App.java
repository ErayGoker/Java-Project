public class App {
    public static void main(String[] args) throws Exception {
        

        ProduceConsumer write=new ProduceConsumer();

        Thread producer=new Thread(new Runnable() {

            @Override
            public void run() {
               write.producer();
            }
             
        });

         Thread consumer=new Thread(new Runnable() {

            @Override
            public void run() {
               write.consumer();
            }
             
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("bitti");






    }
}
