
import java.util.Scanner;

// Activitat 27 — Login amb 3 intents (condició d'acabament complexa)
public class LoginTresIntents {
    public static void main(String[] args) {
        // TODO: guarda l'usuari i la contrasenya correctes en dues variables
        //   (per exemple "cponts" / "qw34T1234")
        //   amb un bucle while, la condició del qual combini "intents < 3" I
        //   "encara no s'ha encertat" (condició d'acabament complexa):
        //     demana usuari i contrasenya, comprova si són correctes
        //     mostra "Usuari i contrasenya correctes!" o un missatge d'error
        //     incrementa el comptador d'intents
        //   ⛔ NO facis servir break (ni similar), ni alteris el comptador
        //      d'intents per forçar la sortida del bucle
        //   Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
        Scanner teclat = new Scanner(System.in);
        String usuari = "cponts";
        String contrasenya = "qw34t1234";
        int intents = 3;
        boolean encertat = false;
        while (intents > 0 && !encertat)
        {
            System.out.println("Introdueix un usuari: ");
            String usuari_introduit = teclat.nextLine();
            System.out.println("Introdueix una contrasenya: ");
            String contrasenya_introduida = teclat.nextLine();

            if(contrasenya_introduida.equals(contrasenya)&&usuari_introduit.equals(usuari))
            {
                System.out.println("Usuari i contrasenya correctes!");
                encertat = true;
            }
            else {
                System.out.println("Encara no s'ha encertat!");
                intents--;
                if(intents == 0)
                {
                    System.out.println("Usuari bloquejat!");
                }   
            }
        }   
    }
}
