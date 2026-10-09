
import java.util.Scanner;

// Activitat 17 — Gran i petit, apropant-se
public class GranIPetit {
    public static void main(String[] args) {
        // TODO: llegeix dos números per teclat: gran i petit
        //   amb un bucle while, mentre gran sigui més gran que petit:
        //     mostra "Gran = <gran>   Petit = <petit>"
        //     divideix gran entre 2 i multiplica petit per 2
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número gran: ");
        int gran = teclat.nextInt();
        System.out.println("Introdueix un número petit: ");
        int petit = teclat.nextInt();
        while(gran > petit)
        {
            System.out.println("Gran = "+gran+" Petit = "+petit);
            int divisio = gran/2;
            int multiplicacio = petit*2;
            System.out.println("Introdueix un número gran: ");
            gran = teclat.nextInt();
            System.out.println("Introdueix un número petit: ");
            petit = teclat.nextInt();
        }

    }
}