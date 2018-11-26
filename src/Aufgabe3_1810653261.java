import javax.swing.*;

public class Aufgabe3_1810653261 {

    public static void main(String [] args){
        String Eingabe= JOptionPane.showInputDialog("Geben sie etwas ein"); // String variable erstellt und nach eingabe gefragt
        double alter=Double.parseDouble(Eingabe); // String zu double mit double.parseDouble konvertiert, double ist für kommastellen

        JOptionPane.showMessageDialog(null, alter); // Ausgabe der Eingabe, Man kann nur zahlen mit komma ausgeben bei buchstaben kommt eine fehlermeldung, null um die ebene des dialogfelds zu bestimmen

        String Eingabe2= JOptionPane.showInputDialog("Geben sie etwas ein"); // String variable 2 erstellt und nach int-eingabe-wert  gefragt
        int alter2=Integer.parseInt(Eingabe2); // Int=Zahlenwert

        JOptionPane.showMessageDialog(null, alter2); // Ausgabe der Eingabe

        String Eingabe3= JOptionPane.showInputDialog("Geben sie einen booleanwert ein"); // String variable 3 erstellt und nach booleanwert gefragt
        boolean alter3=Boolean.parseBoolean(Eingabe3);// boolean=Wahrheitswerte

        JOptionPane.showMessageDialog(null, alter3); // Ausgabe der Eingabe


        String Eingabe4= JOptionPane.showInputDialog("Geben sie einen longwert ein"); // String variable 4 erstellt und nach long-wert gefragt gefragt
        long alter4=Long.parseLong(Eingabe4); //long = Zahlenwertebereich

        JOptionPane.showMessageDialog(null, alter4); // Ausgabe der Eingabe

        String Eingabe5= JOptionPane.showInputDialog("Geben sie einen charwert ein"); // String variable 5 erstellt und nach char-wert gefragt gefragt
        char alter5=Eingabe5.charAt(0); //  Aus angabe herausgezogen

        JOptionPane.showMessageDialog(null, alter5); // Ausgabe der Eingabe

        String Eingabe6= JOptionPane.showInputDialog("Geben sie einen bytewert ein"); // String variable 6 erstellt und nach byte-wert gefragt gefragt
        byte alter6=Byte.parseByte(Eingabe6); // byte= kleiner Zahlwertbereich


        JOptionPane.showMessageDialog(null, alter6); // Ausgabe der Eingabe

        String Eingabe7= JOptionPane.showInputDialog("Geben sie einen shortwert ein"); // String variable 7 erstellt und nach short-wert gefragt gefragt
        short alter7=Short.parseShort(Eingabe7);

        JOptionPane.showMessageDialog(null, alter7); // Ausgabe der Eingabe


        String Eingabe8= JOptionPane.showInputDialog("Geben sie einen floatwert ein"); // String variable 7 erstellt und nach float-wert gefragt gefragt
        float alter8=Float.parseFloat(Eingabe8); //einfache genauigkeit 32bit

        JOptionPane.showMessageDialog(null, alter8); // Ausgabe der Eingabe




        String variable=String.valueOf(alter);// neue string variable mit dem wert von alter

        JOptionPane.showMessageDialog(null, variable); // ausgabe der Eingabe
    }
}
