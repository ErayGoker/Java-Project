import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit {
    
    
    public static void oyunKayded(Kontrol [][] kartlars)
    {
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("kayit.bin", true))) {
        
            out.writeObject(kartlars);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static  Kontrol[][] kartDondur(){
        try (ObjectInputStream in=new ObjectInputStream(new FileInputStream("kayit.bin"))) {
        
            Kontrol [][] cikti= (Kontrol[][])in.readObject();
            return cikti;

        } catch (Exception e) {
             System.out.println("hata olustu");
            return null;
        }
        
    }


    }
