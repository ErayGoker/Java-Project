

public class BaybladeMachine {

   public Bayblade baybladeUret(String isim,Bicaklar bicak,Simge simge){

        if (isim.equals("dragon")) {
            return new Dragon(bicak, simge,isim ,600 , "alev topu");
            
        }
        else if (isim.equals("dranza")) {
            return new Dranza(bicak, simge, isim, 500, "zihin kontrolu");
        }

        else{

            System.out.println("lutfen gecerli bi bayblade seciniz");
             return null;

        } 
            
           
   }
    
}
