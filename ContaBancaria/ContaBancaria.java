package exercicios;
import javax.swing.*;

public class ContaBancaria {
    /**
     * Atribuots privados: uso do encapsulamento para proteger os atributos
     * */
    private String numeroConta;
    private double saldo;
    private String titular;

    /**
     * Construtor: define como os objetos serão criados
     */
    public ContaBancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }else {
            System.out.println("Erro: valor insuficiente para depósito.");
        }
    }

    public void sacar(double valor) {
        if(valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor+ " realizado com sucesso!");
        }else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido!");
        }
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void alterarTitular(String novoTitular) {
        if (novoTitular.equals("")) {
            System.out.println("Erro: o nome do titular não pode ser vazio!");
        } else {
            titular = novoTitular;
            System.out.println("Titular alterado para: " + titular);
        }
    }

    public void dadosConta(){
        System.out.println("Dados Cliente" + "\nTitular: " + titular + "\nNumero da conta: " + numeroConta + "\nSaldo: " + saldo);
    }

}
