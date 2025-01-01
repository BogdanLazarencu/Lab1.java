
import java.util.Random;


public class Fibbonacci {
    public static void main(String[] args) {
        Random random = new Random();

        int numar1 = random.nextInt(21);
        System.out.println("Numarul generat-- " + numar1);

        if (esteFibonacci(numar1)) {
            System.out.println(numar1 + " FACE parte din șirul Fibonacci.");
        } else {
            System.out.println(numar1 + " NU face parte din șirul Fibonacci.");
        }
    }
        public static boolean esteFibonacci(int n) {
        if (n < 0) return false;

        return estePatratPerfect(5 * n * n + 4) || estePatratPerfect(5 * n * n - 4);
    }


        public static boolean estePatratPerfect(int numar1) {
        int radacina = (int) Math.sqrt(numar1);
        return radacina * radacina == numar1;
    }



}
