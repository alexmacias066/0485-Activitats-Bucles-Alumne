
import java.util.Scanner;

// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for
public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero = teclat.nextInt();

        int comptador_errors = 0;

        for(int i=0; i<=10; i++)
        {
            int resultat = numero*i;
            System.out.print(numero + " x " + i + " = ");
            int resposta = teclat.nextInt();
            if(resposta==resultat)
            {
                System.out.println("Correcte!");
            }
            else{
                System.out.println("Incorrecte!");
                comptador_errors++;
            }
        }
        System.out.println("Has comès " +comptador_errors+" errors");
    }
}
