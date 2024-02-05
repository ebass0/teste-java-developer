public class Usuario {
    String id;
    String nome;
    double saldo;

    Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.saldo = 0.0;
    }

    void realizarTransacao(Transacao transacao) {
        if (transacao.getTipo().equals("Deposito")) {
            this.saldo += transacao.getValor();
        } else if (transacao.getTipo().equals("Saque")) {
            this.saldo -= transacao.getValor();
        }
    }
}
