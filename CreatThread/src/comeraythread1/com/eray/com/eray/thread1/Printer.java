package comeraythread1.com.eray.com.eray.thread1;

public class Printer extends Thread{
    
    private String isim;

    public Printer(String isim){
        this.isim=isim;
    }

    @Override
    public void run() {
        
       System.out.println(isim + "calisiyor");
    
        for (int i = 0; i < 10; i++) {
            System.out.println(isim+" yaziyor ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("thread kesintiye ugradi");
            }
        }
        System.out.println(isim+ " isini bitirdi");
    }



}
