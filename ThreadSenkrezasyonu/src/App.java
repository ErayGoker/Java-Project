public class App {

    private int count = 0;

    public synchronized void arttir() {
        count++;
    }

    public void threadSafe() {
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                
                for (int i = 0; i < 5000; i++) {
                    // count++;
                    arttir();
                }

            }

        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    // count++;
                    arttir();
                }

            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("count sayisi " + count);

    }

    public static void main(String[] args) throws Exception {
        App calis = new App();

        calis.threadSafe();
    }
}
