

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bicaklar bicak = new Bicaklar("yeryuzu bicagi", 95);
        Simge simge = new Simge("eray", "ejder");
        Simge simge2 = new Simge("yasemin", "aygir");
        BaybladeMachine machine = new BaybladeMachine();

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen istediginiz bayblade i yazin");
        System.out.println("eger cikis yapmak isterseniz q ya basiniz");
        

        while (true) {
            String BaybladeIsim = input.nextLine();
            if (BaybladeIsim.equals("q")) {
                System.out.println("cikis yapiliyor");
                break;
            } else if (BaybladeIsim.equals("dragon")) {
                System.out.println("lutfen secmek istediginiz simgeyi soyleyin simge ve simge2");
                simge.bilgilerGoster();
                System.out.println();
                simge2.bilgilerGoster();

                String simgeIsmi = input.nextLine();
                if (simgeIsmi.equals("q")) {
                    break;
                }
                do {

                    if (simgeIsmi.equals("simge")) {
                        Bayblade dragon = machine.baybladeUret(BaybladeIsim, bicak, simge);
                        System.out.println("*****************************");
                        dragon.bilgilerGoster();
                        dragon.getBicaklar().bilgilerGoster();
                        
                        dragon.saldir();
                        dragon.ozelGuc();
                        break;

                    } else if (simgeIsmi.equals("simge2")) {
                        Bayblade dragon = machine.baybladeUret(BaybladeIsim, bicak, simge2);
                        System.out.println("*******************************");
                        dragon.bilgilerGoster();
                        dragon.getBicaklar().bilgilerGoster();
                      
                        dragon.saldir();
                        dragon.ozelGuc();
                        break;
                    } 
                     else if (simgeIsmi.equals("q")) {
                        break;
                    }
                    else
                        System.out.println("lutfen gecerli bi simge giriniz");

                } while (simgeIsmi.equals("simge") || simgeIsmi.equals("simge2"));

            }

            else if (BaybladeIsim.equals("dranza")) {
                System.out.println("lutfen secmek istediginiz simgeyi soyleyin simge ve simge2");
                simge.bilgilerGoster();
                System.out.println();
                simge2.bilgilerGoster();

                String simgeIsmi = input.nextLine();
                if (simgeIsmi.equals("q")) {
                    break;
                }
                do {

                    if (simgeIsmi.equals("simge")) {
                        Bayblade dranza = machine.baybladeUret(BaybladeIsim, bicak, simge);
                        System.out.println("*****************************");
                        dranza.bilgilerGoster();
                        dranza.getBicaklar().bilgilerGoster();
                        
                        dranza.saldir();
                        dranza.ozelGuc();
                        break;

                    } else if (simgeIsmi.equals("simge2")) {
                        Bayblade dranza = machine.baybladeUret(BaybladeIsim, bicak, simge2);
                        System.out.println("*******************************");
                        dranza.bilgilerGoster();
                        dranza.getBicaklar().bilgilerGoster();
                      
                        dranza.saldir();
                        dranza.ozelGuc();
                        break;
                    } 
                    else if (simgeIsmi.equals("q")) {
                        break;
                    }
                    else
                        System.out.println("lutfen gecerli bi simge giriniz");

                } while (simgeIsmi.equals("simge") || simgeIsmi.equals("simge2")|| simgeIsmi.equals("q"));
                

            }
            else{
                System.out.println("lutfen gecerli bir bayblade giriniz");
            }
        }

    }

}
