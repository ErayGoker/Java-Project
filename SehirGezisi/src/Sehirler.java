


import java.util.ListIterator;

public class Sehirler {

   

    public ListIterator<String> point ;

    private boolean ileri = true;

   
    public boolean isIleri() {
        return ileri;
    }

    public void setIleri(boolean ileri) {
        this.ileri = ileri;
    }

   
  

  

    public Sehirler(ListIterator<String> point) {
        this.point = point;
    }

    
    public void ileriSehriGoster() {
        if (point.hasNext()) {

            if (!ileri) {
                point.next();
                

            }
        }
        if (!point.hasNext()) {
            System.out.println("Listeye sehir gozukmemektedir");
            ileri = true;
        } else {
            System.out.println("gidilen sehir : " + point.next());
            ileri = true;
        }
    }

    public void geriSehriGoster() {
        if (point.hasPrevious()) {
            if (ileri) {
                point.previous();
                
            }
        }

        if (!point.hasPrevious()) {
            System.out.println("Listenin basindasiniz ");

        } else {
            System.out.println("gidilen sehir : " + point.previous());
            ileri = false;
        }
    }

}
