
import java.util.Scanner;

// Activitat 01 — Temperatures en bucle

public class TemperaturaBucle {
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
        Scanner teclat = new Scanner(System.in);
        int Contador_Temperatura = 0;
      
       while(Contador_Temperatura<5) {
           System.out.println("Introdueix la temperatura en graus Farenheit: ");
           int temperatureF = teclat.nextInt();

           int temperatureC = ((temperatureF - 32) * 5) / 9;
           System.out.println("La temperatura en graus Celisius és: " + temperatureC + " ºC");
           Contador_Temperatura = Contador_Temperatura + 1;
       }
       System.out.println("Adeu!");
    }
}
