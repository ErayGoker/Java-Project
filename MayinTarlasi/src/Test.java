

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kare boyutunu giriniz");
        int boyut=input.nextInt();
        

        Check [][] board= new Check[boyut][boyut];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board [i][j]=new Check();
            }
        }

        Board mayinTarlasi= new Board(board);


        
mayinTarlasi.bombayerlestir();
            mayinTarlasi.bombBoard();
        while (mayinTarlasi.finish()&& !mayinTarlasi.isBitir()) {
            
            System.out.print("satir :");
            int a=input.nextInt();
            System.out.print("sutun :");
            int b=input.nextInt(); 
            
            mayinTarlasi.start((a-1),(b-1));
            mayinTarlasi.board();
        
        }
      

        
        
        
       
    }
    
}
