
import java.util.Random;
import java.util.Scanner;

// Activitat 28 — Endevina el número, 10 intents
public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
        Random numero_aleatori = new Random();
        Scanner teclat = new Scanner(System.in);
        int intents = 10;
        boolean encertat = false;
        int numero = numero_aleatori.nextInt(0,100);
        while(intents <= 10 && !encertat)
        {
            System.out.println("Introdueix un número: ");
            int numero_introduit = teclat.nextInt();
            if(numero_introduit == numero)
            {
                System.out.println("Has encertat!");
                encertat = true;
            }
            else if(numero_introduit != numero)
            {
                System.out.println("Encara no has encertat");
                if(numero_introduit > numero)
                {
                    System.out.println("És més petit");
                }
                else{
                    System.out.println("És més gran");
                }
                intents--;
            }
            if(intents == 0)
            {
                System.out.println("S'han acabat els intetns! El númeor era: "+numero);
            }
        }
    }
}
