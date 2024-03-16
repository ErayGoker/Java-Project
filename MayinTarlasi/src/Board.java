

import java.util.Random;

public class Board {

    public Check[][] mayinTarlasi;
    private boolean bitir = false;

    public boolean isBitir() {
        return bitir;
    }

    public void setBitir(boolean bitir) {
        this.bitir = bitir;
    }

    public Board(Check[][] mayinTarlasi) {
        this.mayinTarlasi = mayinTarlasi;
    }

    public void bombBoard() {

        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi.length; j++) {
                if (mayinTarlasi[i][j].isOyunBasi()) {
                    System.out.print(" |" + mayinTarlasi[i][j].getSymbol() + "| ");
                } else
                    System.out.print(" | | ");
            }
            System.out.println();
            System.out.println("---------------------");

        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (Check[] a : mayinTarlasi) {
            for (Check[] b : mayinTarlasi) {

                System.out.print(" | | ");
            }
            System.out.println();
            System.out.println("---------------------");

        }
        System.out.println();
    }

    public void board() {
        int bombaSayar = 0;

        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi.length; j++) {
                bombaSayar=0;

                if (mayinTarlasi[i][j].getSymbol()=="X" && mayinTarlasi[i][j].isBomb()) {
                    System.out.print(" |X| ");
                    bitir=true;
                }

                else if (mayinTarlasi[i][j].isBomb()) {

                    if (i < mayinTarlasi.length - 1 && mayinTarlasi[i + 1][j].isOyunBasi()) {
                        bombaSayar++;
                    }
                    if (j < mayinTarlasi.length - 1 && mayinTarlasi[i][j + 1].isOyunBasi()) {
                        bombaSayar++;
                    }

                    if (i > 0 && mayinTarlasi[i - 1][j].isOyunBasi()) {
                        bombaSayar++;
                    }
                    if (j > 0 && mayinTarlasi[i][j - 1].isOyunBasi()) {
                        bombaSayar++;
                    }

                    System.out.print(" |"+bombaSayar+"| ");

                }
                 
                else
                    System.out.print(" | | ");
                

                
            }

            System.out.println();
            System.out.println("-------------------------");
        }

        if (bitir) {
            System.out.println("bombaya basdin ezik");
        }
        

    }

    public void bombayerlestir() {

        Random rand = new Random();
        for (int k = 0; k < mayinTarlasi.length; k++) {

            int i = rand.nextInt(mayinTarlasi.length);
            int j = rand.nextInt(mayinTarlasi.length);
            mayinTarlasi[i][j].setOyunBasi(true);

            mayinTarlasi[i][j].setSymbol("X");

        }
    }

    public void start(int i, int j) {
        mayinTarlasi[i][j].setBomb(true);
    }

    public boolean finish(){
        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi.length; j++) {
                if (mayinTarlasi[i][j].getSymbol()=="X") {
                    continue;
                }
               else if (mayinTarlasi[i][j].isBomb()==false ) {
                   return true;
                }
                
            }
            
        }
        return false;
    }

   
    

}
