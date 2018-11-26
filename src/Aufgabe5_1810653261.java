import javax.swing.*;

public class Aufgabe5_1810653261 {
    public static void main(String[] args) {
        forschleife(20);
        forschleife(30);

        whileschleife(0);
        whileschleife(2);

        nutzerschleife();
    }

    static void forschleife(int a) { // forschleifen Methode erstellt static= ohne Objektbildung zugegriffen werden. aus anderen statischen Umgebungen herauskönnen sie direkt mit dem vorangestellten Klassennamenaufgerufen werden

        for (int i = 0; i <= a; i++) { // for schleife mit a durchläufen
            System.out.println("Durchlauf:" + i);// ausgabe der ganzen durchläufe
        }
    }

    static void whileschleife(int b) { // whileschleifen Methode erstellt
        while (b >= 0 && b % 2 == 0 && b < 30) { //whileschleife mit bedingung das es größer null und bis max 30 gehen darf und gerade sein muss
            b++;// 2 mal ++ da man immer eine gerade zahl benötigt
            b++;
            System.out.println("Durchlauf" + b);// ausgabe der ganzen geraden durchläufe
        }
    }

    static void nutzerschleife() { //nutzerschleifen Methode
        int d=Integer.parseInt(JOptionPane.showInputDialog(null,"Geben sie eine Zahl ein")); // nach erster zahl fragen
        int e=Integer.parseInt(JOptionPane.showInputDialog(null,"Geben sie eine Zahl ein")); // nach zweiter zahl fragen
        int k = 0; // variable zum mitzählen der inneren Durchläufe

        for (int i = 0; i < d; i++) { // erste variable als for schleife

            for (int j = 0; j < e; j++) { // zweite variable als for schleife

                k++; // k für jede schleife die durch gemacht wurde
                System.out.println("Das ist der " + k + "Durchlauf der inneren Schleife"); // ausgabe der k gezählten schleifen
            }
        }
    }
}