package com.eray.thread3;

public class Main {
    public static void main(String[] args) {

        // Thread thread1= new Thread(new Runnable() {

        //     @Override
        //     public void run() {
        //         System.out.println("thread calisiyor");
    
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i+" yaziyor ");
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         System.out.println("thread kesintiye ugradi");
        //     }
        // }
        // System.out.println( "Thread isini bitirdi");
        //     }
            
            

        // });


       // thread1.start();

  new Thread(new Runnable() {

            @Override
             public void run() {
                 System.out.println("thread calisiyor");
    
         for (int i = 0; i < 10; i++) {
             System.out.println(i+" yaziyor ");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 // TODO Auto-generated catch block
                 System.out.println("thread kesintiye ugradi");
             }
         }
         System.out.println( "Thread isini bitirdi");
             }
            
            

        }).start();



        System.out.println("main thread calisiyor");
    }
}
