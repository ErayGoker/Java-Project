import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack <Character> stack=new Stack<Character>();

        String word=girisCumleleri();
        for (int i = 0; i < word.length(); i++) {
           char a= word.charAt(i);
            stack.push(a);
            
        }
        if(word.length()%2==0){
            for (int i = 1; i <= word.length(); i++) {
            
                if(stack.elementAt(i-1).equals(stack.elementAt(word.length()-i))){
                    if(i>word.length()-i){
                        System.out.println("polidron kelimedir");
                        break;
                    }

                }
                
                else{   
                    System.out.println("polidrom kelime degildir");
                    break;
                }
            }
        }
        
        else{
             
            for (int i = 1; i <= word.length(); i++) {
            
                if(stack.elementAt(i-1).equals(stack.elementAt(word.length()-i))){
                    if(i==word.length()-i);{
                        System.out.println("polidron kelimedir");

                        break;
                    }
                }
                
                else{   
                    System.out.println("polidrom kelime degildir");
                    break;
                }


            }

            
        }
        
        
        
    
    }

    public static String girisCumleleri() {
        System.out.print(" Hosgeldiniz \n kelimenin polidrom olup olmadigini anlamak icin kelimeyi giriniz : ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        return word;
    }

}
