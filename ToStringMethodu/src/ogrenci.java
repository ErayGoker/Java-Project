
public class ogrenci {
    private String isim;

    public ogrenci(String isim){
        this.isim=isim;
    }
    
    public void setIsim(String isim){
        this.isim=isim;
    }

    public String getIsim(){
        return this.isim;
    }

    @Override
    public String toString() {
        return "ogrenci [isim=" + isim + "]";
    }
    
    

    

    

   



}
