class hayvan{
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public hayvan(String isim) {
        this.isim = isim;
    }

    
    public String konusuyor(){
        return this.isim+" konusuyor";
    }
}


class kopek extends hayvan{
    public kopek(String isim){
        super(isim);
    }

   
     public String konusuyor() {
       
         return this.getIsim()+ " havliyor";
     }

    


}

class kedi extends hayvan{
    public kedi(String isim){
        super(isim);
    }

    @Override
    public String konusuyor() {
        
        return this.getIsim() + " miyavliyor";
    }

    
    

}
public class App {

public static void main(String[] args) {
    hayvan hayvan1=new kopek("karabas");
    System.out.println(hayvan1.konusuyor());
}



}
