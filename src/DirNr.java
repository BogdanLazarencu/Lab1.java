import java.util.Scanner;

public class DirNr
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduceti  numarul dorit: ");
        int nr = scanner.nextInt();
        boolean prim=true;
        System.out.println("Divizorii lui "+ nr+" sunt: ");
        for (int i = 1; i <= nr; i++)
        {
            if (nr % i == 0)
            {
                System.out.print(i + "\n");
                if (i != 1 && i != nr)
                {
                    prim = false;
                }
            }
        }
        if (prim&& nr>1)
        {System.out.println("Numarul "+nr+" este prim!");}
            else{System.out.println("Numarul "+nr+" nu este prim sau nu corespunde cerintelor, adica"+nr+"este <=1");}
    }
}
