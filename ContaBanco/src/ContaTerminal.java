import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "
                + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
        scanner.close();
    }
}