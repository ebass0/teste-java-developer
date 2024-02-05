public class Transacao {
    String tipo;
    double valor;
    Usuario usuario;

    Transacao(String tipo, double valor, Usuario usuario) {
        this.tipo = tipo;
        this.valor = valor;
        this.usuario = usuario;
    }

    String getTipo() {
        return tipo;
    }

    double getValor() {
        return valor;
    }

    void setValor(double valor) {
        this.valor = valor;
    }
}
