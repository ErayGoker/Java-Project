public class StartScreen {

    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public StartScreen(String isim) {
        this.isim = isim;
    }

    public void welcome() {
        System.out.println("\t      HOSGELDIN");
        System.out.println("\t" + "\t" + isim);
        System.out.println();
        System.out.println(
                "  8 sorumuz mevcuttur \n  bu 10 sorudan ilk 4'inde 15 saniye zamanin mevcuttur \n  son 4'inde ise sinirsiz sure hakkiniz bulunmaktadir  \n  2 tane yanlis yapma hakkiniz vardir  \n\n \t   BIL BAKALIM BASLIYOR    ");
        System.out.println();
        System.out.println();

    }

}
