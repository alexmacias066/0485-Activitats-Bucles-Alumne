// Activitat 04 — Temperatures en bucle (quantitat per teclat)
import java.util.Scanner;
public class TemperaturaBucleN {
    public static void main(String[] args) {
        // TODO: demana quantes temperatures (N) vol convertir l'usuari
        //   i després, amb un bucle, llegeix N temperatures en Fahrenheit
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

        Scanner teclat = new Scanner(System.in);

        System.out.println("Quantes temperatures vols convertir?: ");
        int repetir_vegades = teclat.nextInt();
        int N = 0;

        while (N < repetir_vegades)
        {
            System.out.println("Introdueix la temperatura en graus Farenheit: ");
            int temperatureF = teclat.nextInt();

            int temperatureC = ((temperatureF - 32) * 5) / 9;
            System.out.println("La temperatura en graus Celisius és: " + temperatureC + " ºC");
            N = N + 1;
        }
        System.out.println("Ya s'han fet " + repetir_vegades + " conversions");
    }
}
