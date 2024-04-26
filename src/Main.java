import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int one = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int two = sc.nextInt();

        try {
            count(one, two);
        } catch (InvalidException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }

    static void count(int one, int two) throws InvalidException {
        if (one >= two) {
            throw new InvalidException("O segundo parâmetro deve ser maior que o primeiro");
        }



        for (int i = one; i <= two; i++) {
            System.out.println(i);
        }

    }
}



