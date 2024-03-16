

import java.util.Scanner;

public class main {


 


    public static void main(String[] args) {

      


      Kartlar kart=new Kartlar();
      Scanner input=new Scanner(System.in);
      
System.out.println();
System.out.println();

      while (kart.bittimi() ) {
        
            kart.kartTahtasi();
            System.out.println("oyundan cikmak icin q ya basiniz devam icin herhangi bir tusa");
            
            String cikis=input.nextLine();
           try { 
            if (cikis.equals("q")) {
              System.out.println("oyundan cikiliyor");
              
                Thread.sleep(2000);
                System.out.println("kaydetmek ister misin yes or no");
                String kayit=input.nextLine();
                if (kayit.equals("yes")) {
                  OyunKayit kaydet=new OyunKayit();
                  kaydet.oyunKayded(Kartlar.kart);
                  break;
                }
              }
              else{
                System.out.println("oyun devam ediyor");
                Thread.sleep(1000); 
              }
              }
                 catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              

            }
            System.out.println("lutfen resimdeki tablodan birini seciniz ve kordinatlarini giriniz");
            int a=input.nextInt();
            int b=input.nextInt();
            kart.ilkiniBatir(a, b);
           
            System.out.println("lutfen resimdeki tablodan ikinci seciminizi yapiniz");
           int c= input.nextInt();
            int d=input.nextInt();
            input.nextLine();
            kart.denkmi(a,b,c,d);
             
             System.out.println();
             System.out.println();

      }
        

        
       
        
        
    
    
    }
}