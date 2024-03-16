public class Hasta implements Comparable<Hasta>{

    private String name ;
    private String hastaligi;

    private int oncelikSirasi;

    public  Hasta(String name ,String hastaligi ){
        this.name=name;
        this.hastaligi = hastaligi;
        hastaligi.trim();

        if(hastaligi.endsWith("agrisi"))
            oncelikSirasi=3;

        else if(hastaligi.endsWith("kazasi"))
            oncelikSirasi=2;

        else
            oncelikSirasi=1;
    }

    @Override
    public String toString() {
       String bilgiler=" Hasta bilgileri \n  ismi : "+ name + "\n hastaligi : " + hastaligi ;  
        return bilgiler; 
    }

    @Override
    public int compareTo( Hasta hasta) {
        if(this.oncelikSirasi >hasta.oncelikSirasi)
            return 1;
        else if(this.oncelikSirasi < hasta.oncelikSirasi)
            return -1;

        return 0;
    }

    


    
    


}