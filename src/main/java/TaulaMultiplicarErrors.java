
import java.util.Scanner;

// Activitat 13 — Taula de multiplicar, amb comptador d'errors
public class TaulaMultiplicarErrors {
    public static void main(String[] args) {
        // TODO: llegeix un número per teclat i, amb un bucle, pregunta la seva taula
        //   de multiplicar (de l'1 al 10): mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta de l'usuari i digues si és "correcte!"
        //   o "incorrecte!" (comptant els errors amb un comptador que s'incrementi
        //   ell mateix d'un en un)
        //   Al final, mostra: "Has comès X errors!"
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero = teclat.nextInt();
        
        int i = 0;
        int errors = 0;

        while(i<=10)
        {
            int resultat = numero*i;
            System.out.print(numero+" x "+i+" = ");
            int resposta = teclat.nextInt();
            if(resposta==resultat)
            {
                System.out.println("Correcte!");
            }
            else{
                System.out.println("Incorrecte!");
                errors++;
            }
            i++;
        }
        System.out.println("Has comès "+errors+" errors!");
    }
}
