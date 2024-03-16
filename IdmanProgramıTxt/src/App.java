import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class App {
    private static Stack<String> array=new Stack<String>();
    public static final int hareketHakki=3;
    public static void main(String[] args) throws Exception {
          
        System.out.println("\t programa hosgeldiniz idman programinizi kendiniz olusturunuz");


        Scanner input=new Scanner(System.in);


        try (FileWriter write = new FileWriter("idman programi.txt", true)){

            System.out.println("secmek istediginiz idman programini olusturunuz");
            
            System.out.println("squat , push down , dumble cross, walking , bicycle ");

            int i=1;


            while(i <=hareketHakki){
                array.add(input.nextLine());
                i++;
            }

            i=0;

            while (i<hareketHakki) {
                write.write(i+1+". hareket "+array.get(i) +"\n");
                i++;
            }
           



            
        } catch (IOException e) {
            System.out.println("dosyaya veri girilirken hata olustu");
        }




    }
}
