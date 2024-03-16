

public class Bicaklar {
   private String isim;
   private int keskinlikOrani;



public String getIsim() {
    return isim;
}
public void setIsim(String isim) {
    this.isim = isim;
}
public int getKeskinlikOrani() {
    return keskinlikOrani;
}
public void setKeskinlikOrani(int keskinlikOrani) {
    this.keskinlikOrani = keskinlikOrani;
}


public Bicaklar(String isim, int keskinlikOrani) {
    this.isim = isim;
    this.keskinlikOrani = keskinlikOrani;
}

public void bilgilerGoster(){
    System.out.println(getIsim() +" bicaklarina sahiptir ve bu bicaklarin keskinlik orani "+ getKeskinlikOrani() + " dir"  );
    
}

   
    
}
