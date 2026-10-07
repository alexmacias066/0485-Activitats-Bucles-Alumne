
import java.util.Scanner;

// Activitat 08 — Taula de multiplicar d'un número (per teclat)
public class TaulaMultiplicar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter per teclat i, amb un bucle,
        //   mostra la seva taula de multiplicar (de l'1 al 10)
        //   amb el format: "numero × 1 = ...", ..., "numero × 10 = ..."
        Scanner teclat = new  Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int número = teclat.nextInt();
        int número_a_multiplicar = 0;

        while(número_a_multiplicar <= 10)
        {
            int multiplicació = número * número_a_multiplicar;
            System.out.println(número + " x "+número_a_multiplicar+" = "+multiplicació);
            número_a_multiplicar++;
        }
    }
}
