
import java.util.Random;

// Activitat 11 — Cara o creu, 100 llançaments
public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
        Random Cara_Creu_Aleatori = new Random();
        
        int llançaments = 100;
        int Comptador_Creu = 0;
       
        while(llançaments > 0)
        {
            int Cara_Creu = Cara_Creu_Aleatori.nextInt(0,2);
            if(Cara_Creu == 1)
            {
                Comptador_Creu++;
            }
            llançaments--;
        }
        int Comptador_Cares = 100 - Comptador_Creu;
        System.out.println("Cares: "+Comptador_Cares+" i Creus: "+Comptador_Creu);

    }
}
