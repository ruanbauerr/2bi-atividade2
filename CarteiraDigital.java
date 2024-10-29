import java.util.ArrayList;
import java.util.List;

class CarteiraDigital {
    private double saldo;
    private List<String> historico;

    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Adicionado: R$ " + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido. O valor deve ser maior que zero.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.add("Pagamento: R$ " + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        } else {
            System.out.println("Valor inválido. O valor deve ser maior que zero.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void historicoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }
}