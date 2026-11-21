
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 500.00;
        int opcao;

        do {
            System.out.println("===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            
    switch (opcao) {
        case 1:
            System.out.printf("Saldo: R$ %.2f%n", saldo);
            break;

        case 2:
            System.out.print("Digite o valor do depósito: ");
            double deposito = scanner.nextDouble();

            if (deposito > 0) {
                saldo += deposito;
                System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);
            } else {
                System.out.println("Valor inválido!");
            }
            break;

        case 3:
            System.out.print("Digite o valor do saque: ");
            double saque = scanner.nextDouble();

            if (saque > 0 && saque <= saldo) {
                saldo -= saque;
                System.out.printf("Saque realizado! Saldo: R$ %.2f%n", saldo);
            } else {
                System.out.println("Valor inválido ou saldo insuficiente!");
            }
                break;

        case 4:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida!");
    }


        } while (opcao != 4);

        scanner.close();
    }
}
