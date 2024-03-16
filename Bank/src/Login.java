

import java.util.Scanner;

public class Login {
    private String name;
    private int password;
    private long tcNumber;
    private int rightOfEntry=9;
    
    Scanner input=new Scanner(System.in);

    public Login(String name, int password, int tcNumber) {
        this.name = name;
        this.password = password;
        this.tcNumber = tcNumber;
    }


    public int getRightOfEntry() {
        return rightOfEntry;
    }
  


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;

    }

    public long getTcNumber() {
        return tcNumber;
    }

    public void setTcNumber(long tcNumber) {
        this.tcNumber = tcNumber;

    }

    public boolean rightOfEntry(int password, long tcNo) {
        if (this.password == password && this.tcNumber == tcNo)
            return true;
        else {
            rightOfEntry--;
            return false;
        }
    }
    
    public void Login(int password, long tcNumber){

        
       
        
         
        
        if (rightOfEntry(password, tcNumber) && rightOfEntry==0){
            System.out.println("girisiniz yapiliyor lutfen bekleyiniz");
           
        }
        
       
        else {
            System.out.println("sifreniz veya tc no yanlis lutfen tekrar ediniz");
           
        }

         if (rightOfEntry==0){ 
            System.out.println("giris hakkiniz kalmadi lutfen banka gorevlilerine durumu bildirin ");
            
         }
  
    }



}