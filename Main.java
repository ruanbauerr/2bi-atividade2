import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static CarteiraDigital carteira = new CarteiraDigital();

    public static void main(String[] args) {
        System.out.println("Bem-vindo à sua Carteira Digital!");
        int opcao = 0;

        while (opcao != 4) {
            opcao = menu();
            if (opcao == 1) {
                System.out.print("Digite o valor para adicionar ao saldo: ");
                double valorAdicionar = Double.parseDouble(scanner.nextLine());
                carteira.adicionarSaldo(valorAdicionar);
            } else if (opcao == 2) {
                System.out.print("Digite o valor do pagamento: ");
                double valorPagamento = Double.parseDouble(scanner.nextLine());
                carteira.realizarPagamento(valorPagamento);
            } else if (opcao == 3) {
                System.out.printf("Seu saldo atual é: R$ %.2f", carteira.verificarSaldo());
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Obrigado por usar a sua Carteira Digital!");
    }

    public static int menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
        System.out.print("Usuário: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
