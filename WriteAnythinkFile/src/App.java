import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

      

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(new File("test.txt"));

            String metin="eray goker";
            byte [] array=metin.getBytes();
            fos.write(array);

        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                 fos.close();
            } catch (IOException e) {
                System.out.println("dosya kapatilirken hata olustu");
            }
           
        }

        FileInputStream fis=null;
        try {
           
            fis=new FileInputStream("test.txt");
            
            int deger;
            String metin="";
           while ((deger=fis.read())!= -1) {
                

                metin+=(char)deger;
           }
           System.out.println(metin);
        
        } 
        catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        }

        finally{
            try {
                if(fis!=null)
                fis.close();
            
            } catch (IOException e) {
                    System.out.println("dosya kapatilirken hata olustu");
            }
        }
       

    }
}
