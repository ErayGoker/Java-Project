import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;

public class Point {

    private TreeMap<String, String> sorular = new TreeMap<String, String>();
    private Integer hak = 2;
    Integer kazanilanPara=0;
    Integer dogru = 0;
    Integer i=1;

    public Point() {
        QuestionAndAnswer sorular = new QuestionAndAnswer();
        sorular.setSorular();

        this.sorular = sorular.getSorular();
    }

    public Integer getHak() {
        return hak;
    }

    public void setHak(Integer hak) {
        this.hak = hak;
    }

    public TreeMap<String, String> getSorular() {
        return sorular;
    }

    public void setSorular(TreeMap<String, String> sorular) {
        this.sorular = sorular;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sorular == null) ? 0 : sorular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (sorular == null) {
            if (other.sorular != null)
                return false;
        } else if (!sorular.equals(other.sorular))
            return false;
        return true;
    }

    public void puanlama() {

        Timer saat=new Timer();
       
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println();


        TimerTask gorev=new TimerTask() {
            
            while (i <= 8 && hak != 0) {
                
                for (Map.Entry<String, String> soru : sorular.entrySet()) {
                
                    @Override
                    public void run() {
                        int kazanilanPara=0;
                        int dogru = 0;
                        
                        if (hak != 0) {
                            
                            System.out.println(i + ". soru : " + (i * 750) + "  TL ");
                            System.out.print(soru.getKey() + "\t");
                            String cevap = input.nextLine();
                            if (cevap.equals(soru.getValue())) {
                                System.out.println("       DOGRU      ");
                                System.out.println();
                                i++;
                                kazanilanPara+=(i*750);
                                dogru++;
                            } 
                            else {
                                System.out.println("       Yanlis     ");
                                hak--;
                                i++;

                            }
                        } 

                        
                    }

                    if (hak == 0) {
                            if (dogru < 4) {
                                System.out.println(" hakkiniz kalmamistir baraji gecemediginiz icin para odulu veremiyoruz ");
                                System.out.println(" katildiginiz icin tesekkurler ");
                                System.out.println();
                           
                            }
                            else{
                            System.out.println(" Tebrikler baraji gectiginiz icin odulunuz ");
                            System.out.println(kazanilanPara);
                            System.out.println(" katildiginiz icin tesekkurler ");

                            System.out.println();
                        
                            }
                            break;
                        }
                
            
                }
            }
        };
        

    }
}


