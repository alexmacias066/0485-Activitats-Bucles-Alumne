
import java.util.Random;

// Activitat 20 — Cara o creu, 100 llançaments, amb for
public class CaraCreuFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 11, però implementat fent servir un bucle for.
        //   Simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb un comptador (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
        Random cara_o_creu_Random = new Random();
        int comprador_creu = 0;
        for (int llançament = 0; llançament <= 100; llançament++){
            int cara_o_creu = cara_o_creu_Random.nextInt(0,2);
            if(cara_o_creu==1)
            {
                comprador_creu++;
            }
        }
        int calcul_cara_o_creu = 100 - comprador_creu;
        System.out.println("Cares: "+calcul_cara_o_creu+" Creus: "+comprador_creu);
    }
}
