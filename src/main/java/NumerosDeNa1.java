
import java.util.Scanner;

// Activitat 10 — Números de N fins a 1
public class NumerosDeNa1 {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números des de N fins a 1 (un per línia)
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero = teclat.nextInt();
        System.out.println("Generant números: ");
        while(numero > 0)
        {
            System.out.println(numero);
            numero--;
        }
    }
}
