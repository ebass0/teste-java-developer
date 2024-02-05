public class Empresa extends Usuario {
    double taxas;

    Empresa(String id, String nome, double taxas) {
        super(id, nome);
        this.taxas = taxas;
    }

    void processarTransacao(Transacao transacao) {
        if (transacao.getTipo().equals("Saque")) {
            transacao.setValor(transacao.getValor() * (1 + taxas)); // Aplicar taxa
        }
        // Enviar callback para a empresa (simulação)
        System.out.println("Callback enviado para " + this.nome + ": Transação processada");
    }
}
