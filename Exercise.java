import java.util.Scanner;

public class Exercise { 

    public static void main(String[] args) {
        // Hier kannst du auswählen, welches Beispiel du ausführen möchtest
        // berechneMitForSchleife();
        // Oder du kommentierst obiges aus und entkommentierst die folgende Zeile:
        //berechneMitWhileSchleife();
        berechneAddition();
    }

    // Beispiel 1: Berechnung mit for-Schleife
    public static void berechneMitForSchleife() {
        int d = 1;
        int e = 3;

        // Schleife von x = -5 bis x = 5
        for (int x = -5; x <= 5; x++) {
            int ergebnis = parabel(x, d, e);
            System.out.println("Für x = " + x + " ist das Ergebnis: " + ergebnis);
        }
    }

    // Beispiel 2: Berechnung mit while-Schleife und Benutzereingabe
    public static void berechneMitWhileSchleife() {
        Scanner scanner = new Scanner(System.in);
        int d = 1;
        int e = 3;
        int x;

        // Wiederhole die Berechnung, bis der Benutzer 0 eingibt
        do {
            System.out.print("Gib einen Wert für x ein (0 zum Beenden): ");
            x = scanner.nextInt();

            if (x != 0) {
                int ergebnis = parabel(x, d, e);
                System.out.println("Für x = " + x + " ist das Ergebnis: " + ergebnis);
            }
        } while (x != 0);
        //} while (true);

       System.out.println("Programm beendet.");
    }

    public static void berechneAddition() {

        int zahl1 = 5;
        int zahl2 = 2;
        int ergebnis = add(zahl1, zahl2);

        System.out.println("ist das Ergebnis: " + ergebnis);



    }

    // Die Methode, die die Parabel berechnet
    public static int parabel(int x, int d, int e) {
        return (x - d) * (x - d) + e;
 
   }

   public static int add(int x, int y){

    return x-y;

   }
}



