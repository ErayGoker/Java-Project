

public class Bayblade {
    private Bicaklar bicaklar;
    private Simge simge;
    private String BaybladeIsmi;
    private int baybladeGucu;



   
public Bicaklar getBicaklar() {
    return bicaklar;
}
public void setBicaklar(Bicaklar bicaklar) {
    this.bicaklar = bicaklar;
}
public Simge getSimge() {
    return simge;
}
public void setSimge(Simge simge) {
    this.simge = simge;
}

public String getBaybladeIsmi() {
    return BaybladeIsmi;
}
public void setBaybladeIsmi(String baybladeIsmi) {
    BaybladeIsmi = baybladeIsmi;
}
public int getBaybladeGucu() {
    return baybladeGucu;
}
public void setBaybladeGucu(int baybladeGucu) {
    this.baybladeGucu = baybladeGucu;
}


public Bayblade(Bicaklar bicaklar, Simge simge, String baybladeIsmi, int baybladeGucu) {
    this.bicaklar = bicaklar;
    this.simge = simge;
    this.BaybladeIsmi = baybladeIsmi;
    this.baybladeGucu = baybladeGucu;
}
    
    public void saldir(){
        System.out.println(getBaybladeIsmi() + " saldiriya gecti");
        System.out.println(getBaybladeIsmi() +" "+ getBaybladeGucu() + " atack gucu ile saldiriyor");
    }

    public void ozelGuc(){
        System.out.println("bu bayblade in ozel gucu yok");
    }

    public void bilgilerGoster(){
        System.out.print(getBaybladeIsmi()+" ");
        getBicaklar().bilgilerGoster();
        getSimge().bilgilerGoster();
    }




}
