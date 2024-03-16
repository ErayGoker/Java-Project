

public class main {
    public static void main(String[] args) {
        Yolcu yolcular=new Yolcu();
        
       
      yolcular.vizeKontrol(true);
      yolcular.yasalKontrol(false);
      yolcular.yurtDisiHarci(1400);

      if (yolcular.isGecisHakki()) {
        System.out.println("tum islemleriniz gecerlidir iyi yolculuklar");
      }
      else  
        System.out.println("islemlerinizden bazilari hatalidir kontrool edin");


    }
    
}
