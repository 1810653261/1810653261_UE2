import javax.swing.*;

public class Aufgabe2_1810653261 {


    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine zweite Zahl ein"));
        System.out.println(zahl1);
        System.out.println(zahl2);

            if (zahl1 == zahl2) {
                System.out.println(zahl1);
            }
            else if (zahl1 > zahl2) {
                System.out.println("Schritte:" + (zahl1 - zahl2));
                while (zahl2 < zahl1) {
                    zahl2++;
                }
                    System.out.println(zahl2);
                }
            else {
                    System.out.println("Schritte:" + (zahl2 - zahl1));
                while (zahl1 < zahl2) {
                    zahl1++;
                }
                    System.out.println(zahl1);
                }
    }



}
