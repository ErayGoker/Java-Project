package com.eray.matematik;

public class MatematikIslem implements IMatematik {
    
    @Override
    public int toplama(int a, int b) {
        // TODO Auto-generated method stub
       return a+b;
    }

    @Override
    public int cikarma(int a, int b) {
        // TODO Auto-generated method stub
         return a-b;
    }

    @Override
    public int carpma(int a, int b) {
        // TODO Auto-generated method stub
        return a*b;
    }

    @Override
    public double bolme(int a, int b) {
        // TODO( Auto-generated method stub
        return (double)(a/b);
    }

}
