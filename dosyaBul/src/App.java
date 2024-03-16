import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\uygulamalar");
        File file2[]=file.listFiles();
        for (int i = 0; i < file2.length; i++) {
            System.out.println(file2[i].getName());
        }
    }
}
