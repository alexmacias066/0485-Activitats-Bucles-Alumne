
import java.util.Random;
import java.util.Scanner;

// Activitat 29 — El set i mig
public class SetIMig {
    public static void main(String[] args) {
        // TODO: demana l'aposta per teclat
        //   amb un bucle while, la condició del qual combini "total < 7.5" I
        //   "el jugador vol seguir" (condició d'acabament complexa, sense break):
        //     genera una carta aleatòria de l'1 al 10 (8=sota, 9=cavall, 10=rei,
        //     totes valen 0.5; de l'1 al 7 valen el seu número)
        //     suma el seu valor al total i mostra la carta i el total
        //     si el total encara és menor que 7.5, pregunta si vol una altra carta
        //     (si diu que no, deixa de voler seguir)
        //   Quan acabi el bucle, mostra:
        //     "Has Perdut!!!!" si el total supera 7.5
        //     "Has Guanyat <2 x aposta> euros." si el total és exactament 7.5
        //     "El jugador es planta!!!" en cas contrari
        Scanner teclat = new Scanner(System.in);
        Random carta_aleatoria = new Random();
        System.out.println("Introdueix la teva aposta: ");
        double aposta = teclat.nextDouble();
        
        double total = 0.0;
        boolean Seguir_Jugant = true;

        while(total < 7.5 && Seguir_Jugant)
        {
            int carta = carta_aleatoria.nextInt(0,10)+1;

            double valor_carta;
            if(carta >= 8)
            {
                valor_carta = 0.5;
            }
            else{
                valor_carta = carta;
            }
            System.out.println("T'ha sortit la carta: "+carta);
            if(total < 7.5){
                System.out.println("Vols una altra carta (s/n)?: ");
                char resposta = teclat.next().charAt(0);
                if(resposta=='s'||resposta=='S')
                {
                    Seguir_Jugant = true;
                }
                else{
                    Seguir_Jugant = false;
                }
            }
            if(total > 7.5)
        {
            System.out.println("Has perdut!!!");
        }
        else if(total==7.5)
        {
            System.out.println("Has guanyat "+(2*aposta)+" euros");
        }
        else{
            System.out.println("El jugador és planta");
        }
        }
        
    }
}
