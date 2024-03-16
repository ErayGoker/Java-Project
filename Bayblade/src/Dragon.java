

public class Dragon extends Bayblade {
    
    private String ozelGuc;


    public Dragon(Bicaklar bicaklar, Simge simge, String baybladeIsmi, int baybladeGucu ,String ozelGuc) {
        super(bicaklar, simge, baybladeIsmi, baybladeGucu);
        this.ozelGuc=ozelGuc;
    }


    public String getOzelGuc() {
        return ozelGuc;
    }


    public void setOzelGuc(String ozelGuc) {
        this.ozelGuc = ozelGuc;

    }


    @Override
    public void bilgilerGoster() {
       
        super.bilgilerGoster();
    }

    public void saldir(){
        super.saldir();
    }


    @Override
    public void ozelGuc() {
        System.out.println(getBaybladeIsmi()+ " ozel gucu : " + ozelGuc);
    }

    

}
