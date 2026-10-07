
import java.util.Scanner;

// Activitat 06 — Números d'1 fins a N
public class NumerosDe1aN {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números d'1 fins a N (un per línia)
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int N = teclat.nextInt();
        int numero_Vegades = 1;
       
        System.out.println("Generant números");
       
        while(N >= numero_Vegades)
        {
            System.out.println(numero_Vegades);
            numero_Vegades++;
        }
    }
}
