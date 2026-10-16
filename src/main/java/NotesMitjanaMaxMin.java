
import java.util.Scanner;

// Activitat 26 — Mitjana, nota més gran i nota més petita
public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix el número d'alumnes: ");
        int numero_alumnes = teclat.nextInt();
        
        System.out.println("Introdueix la nota: ");
        double nota = teclat.nextDouble();
        
        int i = 2;
        double suma = 0;
        
        double notaMajor = nota;
        double notaMenor = nota;
        
        while(i<=numero_alumnes)
        {
            System.out.println("Introdueix la nota: ");
            nota = teclat.nextDouble();
            
            if(nota > notaMajor)
            {
                notaMajor = nota;
            }
            if(nota < notaMenor)
            {
                notaMenor = nota;
            }
            suma = suma + nota;
            suma++;
            i++;
        }
        double mitjana = suma / numero_alumnes;
        System.out.println("La mitajana de la classe és: "+mitjana+", la nota més alta és: "+notaMajor+" i la més petita: "+notaMenor);

    }
}
