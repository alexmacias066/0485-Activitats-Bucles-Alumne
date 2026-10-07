
import java.util.Random;

// Activitat 02 — Números aleatoris
public class NumerosAleatoris {
    public static void main(String[] args) {
        // TODO: genera 50 números aleatoris entre 1 i 15 (tots dos inclosos, amb Random)
        //   i mostra'ls per pantalla, un per línia (amb un bucle)
        Random generadorAleatori = new Random();
       
        int i = 0;
        
        while (i <= 50)
        {
            int números_Aleatoris = generadorAleatori.nextInt(1,16);
            System.out.println(números_Aleatoris);
            i++;
        }
        System.out.println("50 números generats.");
    }
}
