import javax.swing.*;

public class Aufgabe2_1810653261 {


    public static void main(String[] args) { //Main Methode

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein")); // Zahl1 abfragen
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine zweite Zahl ein")); // Zahl2 abfragen
        System.out.println(zahl1); // Zahl1 ausgeben
        System.out.println(zahl2); // Zahl2 ausgeben

            if (zahl1 == zahl2) { // if Methode um bei gleichenzahlen die zahl auszugeben
                System.out.println(zahl1);
            }
            else if (zahl1 > zahl2) { // esle if mit einer while schleife um zahl2 auf die selbe höhe wie zahl 1 zu bekommen
                System.out.println("Schritte:" + (zahl1 - zahl2)); // notwendige schritte berechnen
                while (zahl2 < zahl1) { //while schleife mit erhöhung der zahl2
                    zahl2++;
                }
                    System.out.println(zahl2); // Ausgabe der Zahl 2 da diese den selben wert wie zahl1 besitzt
                }
            else { //else methode für erhöhung der zahl 1
                    System.out.println("Schritte:" + (zahl2 - zahl1)); // schritteberechnung
                while (zahl1 < zahl2) { //while schleife um zahl 1 zu erhöhen
                    zahl1++;
                }
                    System.out.println(zahl1); // Ausgabe der gemeinsamen zahl
                }
    }
}
