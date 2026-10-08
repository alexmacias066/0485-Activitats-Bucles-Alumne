
import java.util.Scanner;

// Activitat 15 — Seqüència de 3 en 3, amb final per teclat
public class SequenciaDe3en3 {
    public static void main(String[] args) {
        // TODO: demana per teclat el final de la seqüència (un enter)
        //   i mostra, en una sola línia i separats per ", ",
        //   els valors 2, 5, 8, 11, 14... (de 3 en 3) mentre no superin aquest final
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero_final_sequencia = teclat.nextInt();

        for (int i = 1; i<numero_final_sequencia; i=i+3)
        {
            System.out.print(i + ", ");
        }
    }
}
