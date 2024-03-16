public class App {
    public static void main(String[] args) throws Exception {
       
            int f0=1;
            int f1=1;
            int fibNumber;
            System.out.format("%8d",f0);
            System.out.format("%8d",f1);
    
    
            for(int i=3;i<30;i++){
                fibNumber=f0+f1;
                System.out.format("%8d ",fibNumber);
                f0=f1;
                f1=fibNumber;
                if (i%10==0) {
                    System.out.println();
                }
            }
    
        }
        
}

