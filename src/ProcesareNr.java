import java.io.*;
import java.util.*;

public class ProcesareNr {
    public static void main(String[] args) {
        String inputFileName = "src/in.txt";
        String outputFileName = "out.txt";

        try {

            List<Integer> numere = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String linie;
            while ((linie = reader.readLine()) != null) {
                numere.add(Integer.parseInt(linie));
            }
            reader.close();
            int suma = 0;
            int minim = Integer.MAX_VALUE;
            int maxim = Integer.MIN_VALUE;

            for (int numar : numere) {
                suma += numar;
                if (numar < minim) minim = numar;
                if (numar > maxim) maxim = numar;
            }

            double media = (double) suma / numere.size();

            System.out.println("Suma: " + suma);
            System.out.println("Media aritmetică: " + media);
            System.out.println("Valoarea minimă: " + minim);
            System.out.println("Valoarea maximă: " + maxim);

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write("Suma: " + suma + "\n");
            writer.write("Media aritmetică: " + media + "\n");
            writer.write("Valoarea minimă: " + minim + "\n");
            writer.write("Valoarea maximă: " + maxim + "\n");
            writer.close();

            System.out.println("Rezultatele au fost scrise în " + outputFileName);

        } catch (IOException e)
        {
            System.err.println("Eroare la citirea sau scrierea fișierului: " + e.getMessage());
        } catch (NumberFormatException e)
        {
            System.err.println("Eroare la conversia unui număr din fișier: " + e.getMessage());
        }
    }
}
