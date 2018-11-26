public class Aufgabe4_1810653261 {
    public static void main(String [] args) {

        int i=0; // Variable festgelegt

        while (i < 10) // while Schleife mit variable kleiner 10
        {
            i++; // variable hochzählen lassen
            System.out.println("Der Schleifenzähler ist:" + i ); // variablen ausgegeben
        }
        int x=1; // variable festgelegt

        for (; x<=10; x++) { //for schleife mit variable kleiner gleich 10
            System.out.println("Der Schleifenzähler ist:" + x); // Variablen ausgeben lassen
        }

        int y=1;//variable festgelegt

        do {//do-while schleife mit variable y=1 ausgeben und anschließend zählen anfangen lassen
            System.out.println("Der Schleifenzähler ist:" + y);
            y++;
        } while (y<10);//while schleife: bis es 10 ist ausgeben
        System.out.println("Der Schleifenzähler ist:" + y);

        }
    }
