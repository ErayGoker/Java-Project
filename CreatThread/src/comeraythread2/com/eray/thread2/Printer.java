package comeraythread2.com.eray.thread2;

public class Printer implements Runnable{

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
