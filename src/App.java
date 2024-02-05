import java.util.ArrayList;
import java.util.List;

public class App {
    List<Usuario> usuarios;
    List<Transacao> transacoes;

    public App() {
        this.usuarios = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarTransacao(Transacao transacao) {
        transacao.usuario.realizarTransacao(transacao);
        if (transacao.usuario instanceof Empresa) {
            ((Empresa) transacao.usuario).processarTransacao(transacao);
        }
        // Simulação de notificação para o cliente
        System.out.println("Notificação enviada para " + transacao.usuario.nome + ": Transação realizada");
        transacoes.add(transacao);
    }

    public static void main(String[] args) {
        App sistema = new App();

        Empresa empresa = new Empresa("123456789", "Empresa A", 0.05);
        Cliente cliente = new Cliente("987654321", "Cliente B");

        sistema.adicionarUsuario(empresa);
        sistema.adicionarUsuario(cliente);

        Transacao transacao = new Transacao("Deposito", 100.0, cliente);
        sistema.realizarTransacao(transacao);

        Transacao transacaoSaque = new Transacao("Saque", 50.0, empresa);
        sistema.realizarTransacao(transacaoSaque);
    }
}