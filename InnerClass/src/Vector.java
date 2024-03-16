

import java.util.Scanner;

public class Vector {

    private String isim;
    private int i;
    private int j;
    private int k;


    public Vector(String isim ) {
        this.isim = isim;

        System.out.println("ucgenin  i , j , k degerlerini giriniz");

        Scanner input=new Scanner(System.in);

        this.i = input.nextInt();
        this.j = input.nextInt();
        this.k = input.nextInt();




    }

    public String getIsim() {
        return isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    
}
