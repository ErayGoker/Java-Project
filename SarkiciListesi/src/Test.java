
import java.util.Scanner;

public class Test {
     
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        Sarkicilar sarkicilar=new Sarkicilar();
        AnaMenu giris=new AnaMenu();

        giris.giris();

        int islem;
      
         islem=input.nextInt();                                                                             // tam bitmedi ama ugrasmakta istemedim tesekkurler
         input.nextLine();

        while (islem!=7) {
            islem=input.nextInt();
            input.nextLine();

            switch (islem) {
                case 1:
                    sarkicilar.islemler();
                    break;
                case 2:
                    sarkicilar.sarkicilariGoster();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("lutfen sarkici ismini giriniz");
                   
                    sarkicilar.sarkiciEkle( input.nextLine());
                    break;
                case 4:
                    System.out.println("lutfen silmek istediginiz sarkicinin sirasini giriniz");
                    sarkicilar.sarkicilariGoster();

                    sarkicilar.sarkiciSil(input.nextInt());
                    break;
              
            }
        }
    
    }
}
