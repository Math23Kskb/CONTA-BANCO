import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numeroConta;

        String agencia;

        String nomeCliente;

        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Numero da Agencia : ");
        numeroConta = scanner.nextInt();
        scanner.close();

        System.out.println("Por favor, digite o nome da sua Agencia : ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome : ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Sim se deseja ver seu saldo : ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");
    }
}


