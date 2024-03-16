

import java.util.ArrayList;
import java.util.Scanner;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public ArrayList<String> getSarkiciListesi() {
        return sarkiciListesi;
    }

    public void setSarkiciListesi(ArrayList<String> sarkiciListesi) {
        this.sarkiciListesi = sarkiciListesi;
    }

    public void sarkiciEkle(String name) {
        sarkiciListesi.add(name);
        System.out.println(name + " listeye eklenmistir");
    }

    public void sarkicilariGoster() {
        if (sarkiciListesi.size()<0) {
            System.out.println("listede hic bir sarkici bulunmamaktadir");
        }
        else
            for (int i = 0; i < sarkiciListesi.size(); i++) 
                System.out.println((i + 1) + "." + " " + sarkiciListesi.get(i));

        
        
    }

    public void sarkiciSil(int sirasi) {
        if (sarkiciListesi.size() + 1 < sirasi) {
            System.out.println("girdiginiz sirada bir sarkici bulunmamaktadir");
        } else {
            System.out.println(sarkiciListesi.get((sirasi - 1)) + " " + " listeden cikariliyor");
            sarkiciListesi.remove((sirasi - 1));
        }
    }

    public void sarkiciGuncelle(int sirasi, String isim) {
        if (sarkiciListesi.size() + 1 < sirasi) {
            System.out.println("girdiginiz sirada bir sarkici bulunmamaktadir");
        } else {
            System.out.println(
                    sarkiciListesi.get(sirasi - 1) + " cikartilip yerine " + isim + " adli sarkici yerlestirilmistir ");
            sarkiciListesi.set(sirasi, isim);
        }
    }

    public void sarkiciAra(String name){
       int mevcutmu= sarkiciListesi.indexOf(name);
        if (mevcutmu>=0) {
            System.out.println(name+ " isimli sarkicimiz" +(mevcutmu+1)+". siradadir");
        }
        else{
            System.out.println("oyle bir sarkici yoktur :( ");
        }
    }

    public void islemler(){
       
        System.out.println("\t 1. islemleri goruntule");
        System.out.println("\t 2. sarkicilari goruntule");
        System.out.println("\t 3. sarkici ekle");
        System.out.println("\t 4. sarkici guncelle");
        System.out.println("\t 5. sarkici sil");
        System.out.println("\t 6. sarkici ara");
        System.out.println("\t 7. uygulamadan cik");
        
         

    }

}
                     