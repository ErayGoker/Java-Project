import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String location [][]=new String[100][3]; 
        
        int count=0;
        int kareSayisi=0;
        File file=new File("Kod.txt");

        file.createNewFile();

        BufferedReader read= new BufferedReader(new FileReader("Kod.txt"));

        while(read.ready()){

            String cumle = read.readLine();
            String array[]=cumle.split(" ");
            for (int i = 0; i < 3; i++) {
                location[count][i]=array[i];
            }
            count++;
        }

        for (int i = 0; i < count; i++) {
           
            
                


            
        }


        


        


    }
}
