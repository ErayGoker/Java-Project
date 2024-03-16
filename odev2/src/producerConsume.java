import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class producerConsume {

    public LinkedList<Integer> list = new LinkedList<Integer>();
    public int size = 1229;
    Object lock = new Object();

    public void producer() {

        synchronized (lock) {
            while (list.size()!=size) {

                for (int i = 2; i < 10000; i++) {
                    for (int j = 2; j <= i; j++) {
                        if (i == j) {

                            if (list.size() == size) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }
                            list.offer(i);
                            lock.notify();
                        }
                        if (i % j == 0) {
                            break;
                        }

                    }

                }
            }
        }
    }

    public void conseme() {

        synchronized (lock) {
            while (true) {
                if (list.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println(list.poll());
                

            }
        }
    }
}
