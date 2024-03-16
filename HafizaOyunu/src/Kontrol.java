import java.io.Serializable;

public class Kontrol implements Serializable{

    
    private boolean kontrol;
    private char symbol;
    
    public boolean isKontrol() {
        return kontrol;
    }
    public void setKontrol(boolean kontrol) {
        this.kontrol = kontrol;
    }
    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public Kontrol(char symbol) {
        this.symbol = symbol;
    }

    

    
    

  
    
}
