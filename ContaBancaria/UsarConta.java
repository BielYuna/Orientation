public class UsarConta {
    public static void main(String[] args) {
        ContaBancaria servico = new ContaBancaria("12345-6","Gabriel",1000);

        servico.dadosConta();
        servico.depositar(500);
        servico.sacar(2000);
        servico.sacar(300);
        servico.alterarTitular("");
        servico.consultarSaldo();
        servico.dadosConta();
    }
}