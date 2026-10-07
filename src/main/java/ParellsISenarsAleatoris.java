
import java.util.Random;
import java.util.Scanner;

// Activitat 12 — Comptar parells i senars, aleatoris
public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"
        Scanner teclat = new Scanner(System.in);
        Random números_aleatoris = new Random();
        
        System.out.println("Quants números vols generar?: ");
        int N = teclat.nextInt();
        int intents = N;

        int parells = 0;
        while(intents>0)
        {
            int numeros_generats = números_aleatoris.nextInt(0,N);
            if(numeros_generats % 2 == 0)
            {
                parells++;
            }  
            intents--;
        }
        int senars = N - parells;
        System.out.println("Han sortit "+parells+" números parells i "+senars+" números senars");
    }
}
