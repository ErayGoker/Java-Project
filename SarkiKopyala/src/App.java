import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void oku() {

        FileInputStream fis = null;
        
        try {
            File sarki = new File("sarki.mp3.mp3");

            fis = new FileInputStream(sarki);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        int deger;

        try {
            while ((deger = fis.read()) != -1) {

                icerik.add(deger);

            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        finally {
            try {
                if (fis != null)

                    fis.close();
            } 
            catch (IOException e) {
                
                e.printStackTrace();
            }

        }
    }



    public static void yaz() {

        FileOutputStream fos =null;
        

        try {
            File file=new File("sarki2.mp3");
            fos= new FileOutputStream(file,true);
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        }
        
       try { 
        for (int i = 0; i < icerik.size(); i++) {
            
                fos.write(icerik.get(i));
        }
            } 
            catch (IOException e) {
                
                e.printStackTrace();
            }
        

        
        finally{
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }


    
    }

    public static void main(String[] args) throws Exception {

        oku();
        yaz();

    }
}
