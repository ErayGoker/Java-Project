

import java.util.Scanner;

public class Atm {
    
    public  Atm(Login welcome){
        
        Scanner input=new Scanner(System.in);
        System.out.println("hosgeldiniz");
        System.out.println("lutfen sifrenizi ve tcNo giriniz");
        
            
        while ( welcome.getRightOfEntry() >0 ) {
            int password=input.nextInt();
            int tcNo=input.nextInt();
            if (welcome.rightOfEntry(password, tcNo)) {
                 welcome.Login(password, tcNo); 
                 break; 
            }
            if(!(welcome.rightOfEntry(password, tcNo))) {
                welcome.Login(password, tcNo);
                
            }
            
           
        }    
        
    }
}
