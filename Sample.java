public class Sample {

    static void methode(String test) {

        System.out.println("was geht ab " + test);

    }

    static int quadrat(int a) {

        return a * a;
    }

    static int parabel(int x, int d, int e) {

        return (x - d) * (x - d) + e;

    }

    public static void main(String[] args) {


        int lowerLimit = -10;
        int upperLimit = 11;


        System.out.println("\nX Werte:");

        for (int i = lowerLimit; i < upperLimit; i = i + 1) {
            System.out.print("\t" + i);

        }

        System.out.println("\nNormalparabel:");

        for (int i = lowerLimit; i < upperLimit; i = i + 1) {

            System.out.print("\t" + quadrat(i));
        }

        int d = 3;
        int e = 0;

        for (d = -3; d < 4; d++) {

            System.out.println("\nScheitel (" + d + "|" + e + ")");

            for (int i = lowerLimit; i < upperLimit; i = i + 1) {

                System.out.print("\t" + parabel(i, d, e));
            }

            System.out.println();

        }

        d=0;
        for (e = -3; e < 4; e++) {

            System.out.println("\nScheitel (" + d + "|" + e + ")");

            for (int i = lowerLimit; i < upperLimit; i = i + 1) {

                System.out.print("\t" + parabel(i, d, e));
            }

            System.out.println();

        }

    }

}