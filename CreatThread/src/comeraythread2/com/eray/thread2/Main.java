package comeraythread2.com.eray.thread2;

public class Main {

    public static void main(String[] args) {
        Thread printer1=new Thread(new Printer("eray")); 
        Thread printer2=new Thread(new Printer("yasmin")); 

        printer1.start();
        printer2.start();

        System.out.println("main Thread calisiyor");

    }
    
}
