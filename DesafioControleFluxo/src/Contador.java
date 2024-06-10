
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            scanner.close();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
				System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
            }

        } catch (InputMismatchException exception) {
            System.err.println("O parâmetro deve ser um número inteiro.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
