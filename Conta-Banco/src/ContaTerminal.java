
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int contaNumero;
        String contaAgencia, contaNome, contaSobrenome;
        double contaSaldo;

        System.out.println("Bem-vindo! Vamos criar a sua conta.");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o número da sua conta");
        contaNumero = scanner.nextInt();

        System.out.println("Insira o número da sua agência com traço (ex: 100-1)");
        contaAgencia = scanner.next();

        System.out.println("Insira o nome do proprietário da conta");
        contaNome = scanner.next();

        System.out.println("Insira o sobrenome do proprietário da conta");
        contaSobrenome = scanner.next();

        System.out.println("Insira o saldo da conta");
        contaSaldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + contaNome + " " + contaSobrenome + " obrigado por criar uma conta em nosso banco! Sua agência é " + contaAgencia + ", conta " + contaNumero + " e seu saldo " + contaSaldo + " já está disponível para saque!");

    }
}
