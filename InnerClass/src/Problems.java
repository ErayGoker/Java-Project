

public class Problems {

    private static double PI=Math.PI;

    public static class Matematik{

        public void ucgenCevresi(int ilkKenar,int ikinciKenar,int ucuncuKenar){

            System.out.println("ucgenin cevresi : " + (ilkKenar+ikinciKenar+ucuncuKenar));
        }

        public static void daireAlani(int yaricap){
            System.out.println("dairenin alani : " + (float)(Math.pow(yaricap, yaricap)*PI)   );
        }


    }


    public static class fizik{

        Vector vektor=new Vector("firstSekil");
        Vector vektor1=new Vector("secondSekil");

        public void vektorCarpimi(){
          int sonuc= (vektor.getI()*vektor1.getI())+(vektor.getJ()*vektor1.getJ())+(vektor.getK()*vektor1.getK());
            System.out.println("2 seklin vektor carpimi : " + sonuc);
        }

    }
    
}
