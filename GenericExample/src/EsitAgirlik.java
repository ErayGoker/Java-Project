
public class EsitAgirlik  extends Adaylar implements Method {

    private int toplamPaun;


   public EsitAgirlik(int turkce, int matematik, int sosyal, int fen,String isim) {
        super(turkce, matematik, sosyal, fen,isim);

        
    }

    public int getToplamPaun() {
        return toplamPaun;
    }

    public void setToplamPaun(int toplamPaun) {
        this.toplamPaun = toplamPaun;
    }

   

    public int puanHesapla() {
        
        return ((super.getTurkce()*4)+(super.getMatematik()*4)+(super.getSosyal()*3)+(super.getFen()*1));
   }

    @Override
    public void bilgileriGoster() {
        System.out.println("turkce neti : "+ super.getTurkce() +"\nmatematik neti : "+ super.getMatematik() +"\nsosyal neti : "+ super.getSosyal() +"\nfen neti : "+ super.getFen() +"\nisim : " + super.getIsim());
    }

}
