


public class test {

    public static void main(String[] args) {
        
        Adaylar ogrenci=new Adaylar(34, 40, 20, 20, "eray");


        EsitAgirlik ogrenci2=new EsitAgirlik(34, 27, 10, 12, "eray");

        Sayisal aday1=new Sayisal(10, 37, 8, 15, "YASMIN");
    
       

        birinci(aday1, ogrenci2).bilgileriGoster();

      
        // adaylar sinifindan bi obje belirleyip onu sayisal ya da esit agirliga referans olarak atamiyorum !!!!!!!
    }




    public static <E extends Method> E birinci(E ogrenci ,E ogrenci2){
        if (ogrenci.puanHesapla() > ogrenci2.puanHesapla()) {
            return ogrenci;
        }
        return ogrenci2;

    }
    
}
