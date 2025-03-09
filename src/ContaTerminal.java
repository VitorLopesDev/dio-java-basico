import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String agencia, nomeCliente;
        int numero;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência !: ");
        agencia = scan.nextLine();
        System.out.println("Por favor, digite o nome do cliente !: ");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número da conta !: ");
        numero = scan.nextInt();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
