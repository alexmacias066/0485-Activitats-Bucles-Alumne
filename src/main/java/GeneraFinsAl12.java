
import java.util.Random;
import java.util.Scanner;

// Activitat 14 — Genera fins al 12
public class GeneraFinsAl12 {
    public static void main(String[] args) {
        // TODO: amb un bucle do-while, genera números aleatoris entre 0 i 15
        //   fins que surti el 12 (compta les iteracions amb un comptador)
        //   Per cada número que NO sigui el 12, mostra:
        //   "El número generat és: <numero>, falten <distància> per assolir l'objectiu."
        //   (la distància és el valor absolut de numero - 12)
        //   Quan surti el 12, no el mostris: acaba mostrant
        //   "Objectiu assolit en: <iteracions> iteracions"
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random(); 
        char continuar = 'c';

        int numeros_generats;
        
        int contador = 0;
        
        do{
            numeros_generats = generador.nextInt(0,15);
            contador++;
            if(numeros_generats!=12)
            {
                System.out.println("El número generat és: "+numeros_generats+" falten "+(12 - numeros_generats)+" per assolir l'obejctiu.");
                System.out.println("Continuar [C]");
                continuar = teclat.next().charAt(0);
            }
        } 
        while (numeros_generats!=12);
        {
            System.out.println("Obejctiu assolit en: "+contador+" interaccions.");
        }
        
    }
}
