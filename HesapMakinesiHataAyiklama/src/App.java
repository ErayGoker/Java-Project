

import java.util.InputMismatchException;
import java.util.Scanner;

class toplama extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("3 giremezsin");
    }

}

class cikarma extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("ilk deger , ikinci degerden kucuk olamaz");
    }

}

class E extends InputMismatchException {

    @Override
    public void printStackTrace() {
        System.out.println("rakam ya da sayi giriniz ");
    }

}

public class App {

    public static int toplama(int firstValue, int secondValue) throws Exception {

        if (firstValue == 3)
            throw new toplama();
        return firstValue + secondValue;

    }

    public static int cikarma(int firstValue, int secondValue) throws Exception {

        if (firstValue < secondValue)
            throw new cikarma();
        return firstValue - secondValue;

    }

    public static int carpma(int firstValue, int secondValue) throws Exception {
        
        return firstValue * secondValue;

    }

    public static void main(String[] args) throws Exception {
     
     
       try {   
        System.out.println(" 1. toplama \n 2. cikarma \n 3. carpma \n 4. bolme ");
        System.out.println("yapmak istedigin islemi sec");
        Scanner input=new Scanner(System.in);
        int key=input.nextInt();

        System.out.println("ilk degeri ve ikinci degeri giriniz");

        int firstValue=input.nextInt();
            int secondValue=input.nextInt();


     switch (key)  {

        
        
        case 1:
            
           
            try {
            toplama(firstValue, secondValue);
        } catch (toplama ex) {
              ex.printStackTrace();
        }
        finally{
           
            
        }
           

        case 2:
         
         try {
            cikarma(2, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        break;

        case 3 :
            carpma(firstValue,secondValue);


        break;
    
        
       }
} 
    catch (InputMismatchException ex) {
    System.out.println("SALAK");
}
      
    
       
       
       

    

    } 
    
}
 


