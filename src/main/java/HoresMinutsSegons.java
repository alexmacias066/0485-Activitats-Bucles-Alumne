
import java.util.Scanner;

// Activitat 05 — Hores, minuts i segons, en bucle
public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: repeteix 4 vegades (amb un bucle):
        //   demana els segons per teclat i mostra les hores, minuts i segons que representen
        //   Hores  = segons / 3600
        //   Minuts = (segons % 3600) / 60
        //   Segons = segons % 60
        Scanner teclat = new Scanner(System.in);
        int i = 0;
        while (i < 4)
        {
            System.out.println("Introdueix els segons: ");
            int segons = teclat.nextInt();
            int Hores = segons/3600;
            int Minuts = (segons%3600)/60;
            int Segons = segons%60;
            System.out.println(Hores+" h, "+ Minuts+" min, " +Segons+" seg");
            i++;
        }
    }
}
