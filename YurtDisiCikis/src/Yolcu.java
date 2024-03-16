

public class Yolcu implements YurtDisiKontrol{

    private boolean gecisHakki;

    public boolean isGecisHakki() {
        return gecisHakki;
    }

    public void setGecisHakki(boolean gecisHakki) {
        this.gecisHakki = gecisHakki;
    }

    @Override
    public void vizeKontrol(boolean vize) {
        
        if (vize) {
            System.out.println("vizeniz mevcuttur yurt disina cikabilirsiniz");
            setGecisHakki(true);
            
        }
        else{
            System.out.println("vizeniz mevcuttur degildir e devletten kontrol saglayabilirsiniz");
            setGecisHakki(false);
        }
    }

    @Override
    public void yasalKontrol(boolean sicil) {
        if (sicil) {
            System.out.println("sicil kaydiniz mevcuttur yurt disina cikamazsiniz");
            setGecisHakki(false);
        }
        else{
            System.out.println("sicil kaydiniz mevcuttur degildir yurt disina cikabilirsiniz");
             setGecisHakki(true);
        }
    }


    @Override
    public void yurtDisiHarci(int harc) {
        
        if (harc < 1500) {
            System.out.println("harciniz yetersinizdir");
             setGecisHakki(false);
            
        }
        else{
        System.out.println("tum islemleriniz gecerliyse iyi yolculuklar");
        
             setGecisHakki(true);
        }
    }

    



}
