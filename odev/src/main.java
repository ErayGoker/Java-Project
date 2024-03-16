public class main {
    public static void main(String[] args) {
        double a=System.currentTimeMillis();

        for (int i = 2; i < 10000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }  

            }
        }
        double b=System.currentTimeMillis();
        System.out.println(b-a);
    }
}
