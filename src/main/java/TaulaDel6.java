// Activitat 07 — Taula de multiplicar del 6
public class TaulaDel6 {
    public static void main(String[] args) {
        // TODO: amb un bucle, mostra la taula de multiplicar del 6 (de l'1 al 10)
        //   amb el format: "6 × 1 = 6", "6 × 2 = 12", ... "6 × 10 = 60"
        int i = 0;
        int numero_a_multiplicar = 0;
        while (i<=10)
        {
            int multiplicació = 6*numero_a_multiplicar;
            System.out.println("6 x " + numero_a_multiplicar + " = "+multiplicació);
            numero_a_multiplicar++;
            i++;
        }
    }
}
