public class UsarConta {
    public static void main(String[] args) {
        ContaBancaria servico = new ContaBancaria();

        servico.depositar(50);
        servico.sacar(3);
    }
}