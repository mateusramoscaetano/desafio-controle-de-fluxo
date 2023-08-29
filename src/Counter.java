import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite o primeiro argumento");
            int firstArgument = scanner.nextInt();

            System.out.println("Digite o segundo argumento");
            int secondArgument = scanner.nextInt();

            scanner.close();

            count(firstArgument, secondArgument);

        } catch (CounterValidationException e) {
            System.out.println("O segundo argumento não pode ser menor que o primeiro argumento");
        }
    }

    static void count(int firstArgument, int secondArgument) throws CounterValidationException {
        if (secondArgument < firstArgument) {
            throw new CounterValidationException();
        }

        int argumentDiference = secondArgument - firstArgument;

        for (int index = 0; index < argumentDiference; index++) {
            if (index == 0) {
                System.out.println(firstArgument);
            }

            System.out.println(firstArgument += 1);
        }
    }
}
