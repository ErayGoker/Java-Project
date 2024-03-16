


public class App {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j <= 10; j++) {

                System.out.print("*");

            }
        }

        System.out.println();
        System.out.println();

        for (int u = 0; u <= 10; u++) {
            if (u != 0) {
                System.out.println();
            }
            for (int k = 0; k <= 10; k++) {
                if (u == 0) {
                    System.out.print("*");
                } else if (u == 10) {
                    System.out.print("*");

                } else if (k == 0 || k == 10) {
                    System.out.print("*");
                } else if (k > 0 && k < 10) {
                    System.out.print(" ");
                }
            }

        }

        System.out.println();
        System.out.println();
        System.out.println();


    }

}
