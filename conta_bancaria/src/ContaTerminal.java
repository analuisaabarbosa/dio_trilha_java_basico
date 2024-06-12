import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco! O número da sua conta é " + numero + ", o número da sua agência é " + agencia + " e o valor do seu saldo é de R$" + saldo + ".");
    }
}
