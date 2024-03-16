

public class Sayisal extends Adaylar implements Method{

   
    

    public Sayisal(int turkce, int matematik, int sosyal, int fen, String isim) {
        super(turkce, matematik, sosyal, fen, isim);
        
    }

    
    @Override
    public int puanHesapla() {
       return ((super.getTurkce()*4)+(super.getMatematik()*4)+(super.getSosyal()*1)+(super.getFen()*3));
        
    }

     @Override
    public void bilgileriGoster() {
       System.out.println("turkce neti : "+ super.getTurkce() +"\nmatematik neti : "+ super.getMatematik() +"\nsosyal neti : "+ super.getSosyal() +"\nfen neti : "+ super.getFen() +"\nisim : " + super.getIsim());
    }


}