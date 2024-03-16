import java.util.LinkedList;
import java.util.Random;

public class ProduceConsumer {

    public LinkedList<Integer> list = new LinkedList<Integer>();
    public int maxSize = 10;
    Object lock = new Object();

    public void producer() {

        while (true) {

            Random random = new Random();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            synchronized (lock) {

                if (list.size() == maxSize) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                int deger = random.nextInt(100);
                list.add(deger);
                System.out.println(" producer uretiyor : " + deger);
                lock.notify();
            }
        }

    }

    public void consumer() {
        while (true) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            synchronized (lock) {

                if (list.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println("consumer tuketiyor : " + list.poll());
                System.out.println(list.size() + " list in size ");
                lock.notify();

            }

        }
    }

}
