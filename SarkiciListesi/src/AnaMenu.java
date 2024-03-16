
import java.util.Scanner;

public class AnaMenu {
    Sarkicilar sarkicilar=new Sarkicilar();
    Scanner input=new Scanner(System.in);

    

    public void giris(){
        System.out.println("sarki kutusuna hosgeldiniz lutfen isleminizi seciniz : ");
        sarkicilar.islemler();
        
    }

    
}
