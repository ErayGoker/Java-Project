public class App {
    public static void main(String[] args) throws Exception {

        String [] kanallar={" Kral Pop ", " RadyoFM ", " KtuFM " };

        Radyo radyoKanallari=new Radyo(kanallar);

        for (String a : radyoKanallari) {
            System.out.println(a);
        }
    }
}
