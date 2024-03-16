
import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

public class Kartlar  {

   public static Kontrol[][] kart = new Kontrol[4][4];

    public Kartlar() {
         Scanner input=new Scanner(System.in);
        File file=new File("kayit.bin");

       

        if (file.exists()) {
             System.out.println("kayittan mi devam etmek istersin yes or no");
             String cevap=input.nextLine();
        if (cevap.equals("yes")) {
            kart=OyunKayit.kartDondur();
        }
        else{
            kart[0][0] = new Kontrol('G');
        kart[0][1] = new Kontrol('H');
        kart[0][2] = new Kontrol('E');
        kart[0][3] = new Kontrol('D');
        kart[1][0] = new Kontrol('B');
        kart[1][1] = new Kontrol('B');
        kart[1][2] = new Kontrol('E');
        kart[1][3] = new Kontrol('H');
        kart[2][0] = new Kontrol('G');
        kart[2][1] = new Kontrol('A');
        kart[2][2] = new Kontrol('C');
        kart[2][3] = new Kontrol('D');
        kart[3][0] = new Kontrol('F');
        kart[3][1] = new Kontrol('C');
        kart[3][2] = new Kontrol('F');
        kart[3][3] = new Kontrol('A');

        }
        
            
        }
    



        

    }

    public void kartTahtasi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kart[i][j].isKontrol() == true) {
                    System.out.print(" |" + kart[i][j].getSymbol() + "| ");
                } else
                    System.out.print(" | | ");

            }
            System.out.println();
            System.out.println("--------------------");
        }
    }

    public void denkmi(int a, int b, int c, int d) {
       
        

        if (kart[a][b].getSymbol() == kart[c][d].getSymbol()) {
            kart[c][d].setKontrol(true);
            kartTahtasi();
            System.out.println();
            System.out.println();
            System.out.println("seciminiz dogrudur");
        } 
        else {
            kart[c][d].setKontrol(true);
            kartTahtasi();
            System.out.println("seciminiz yanlistir");
            kart[a][b].setKontrol(false);
            kart[c][d].setKontrol(false);
            
            System.out.println();System.out.println();
            
          
            
            
        }

    }

    public void ilkiniBatir(int a ,int b){
         kart[a][b].setKontrol(true);
         kartTahtasi();
         System.out.println();
         System.out.println();
    }

    public boolean bittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kart[i][j].isKontrol() == false) {
                    return true;
                }

            }

        }
        return false;
    }


    public boolean oyundanCik(String kelime){
        if (kelime.equals("q")) {
            return false;
        }
        return true;
    }

    
       

}