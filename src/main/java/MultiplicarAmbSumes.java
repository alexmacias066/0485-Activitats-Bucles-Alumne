
import java.util.Scanner;

// Activitat 24 — Multiplicar amb sumes successives
public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        // TODO: llegeix dos operands enters positius per teclat
        //   multiplica'ls fent servir sumes successives (suma "operand1", "operand2" vegades)
        //   i mostra, en una sola línia, "operand1 + operand1 + ... = resultat"
        //   Per exemple, amb 5 i 4: "5 + 5 + 5 + 5 = 20"
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix un número enter positiu: ");
        int operand1 = teclat.nextInt();
        
        System.out.println("Introdueix un altre númeor enter positiu: ");
        int operand2 = teclat.nextInt();
        
        int suma = 0;
        
        if(operand1<0||operand2<0)
        {
            System.out.println("El número introduit no és vàlid!");
        }
        else{
            for (int i = 0; i < operand2; i++) 
            {
                suma = suma + operand1;
                System.out.print(operand1);
            
                if (i < operand2 - 1) 
                {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + suma);
        }
    }
}
