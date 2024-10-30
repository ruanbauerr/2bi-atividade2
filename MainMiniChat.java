import java.util.Scanner;

public class MainMiniChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando = "";

        MiniChatbot MiniChatbot = new MiniChatbot();

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        do {
            System.out.print("Usuário:");
            comando = scanner.nextLine();

            if (comando.toUpperCase().contains("OI") || comando.contains("OLA")) {
                System.out.println("Minichat :" + MiniChatbot.dizerOi());
            } else if (comando.toUpperCase().contains("COMO VOCE ESTA?")) {

                System.out.println("Minichat :" + MiniChatbot.comoVoceEsta());
            } else if (comando.toUpperCase().contains("QUAL É O SEU NOME?")) {

                System.out.println("Minichat :" + MiniChatbot.qualNome());
            }


        } while (!comando.contains("sair"));
    }
}