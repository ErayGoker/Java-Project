package comeraythread1.com.eray.com.eray.thread1;

public class Main {
    public static void main(String[] args) {
        
        Printer printer = new Printer("eray");
        Printer printer1 = new Printer("yasmin");

        printer.start();
        printer1.start();

        System.out.println("main Thread calisiyor");
    }
}
