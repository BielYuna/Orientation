public class ContaBancaria{
    private String numeroConta;
    private double saldo;
    private String titular;

    public void depositar(int saldo){
        this.saldo = saldo;
    }
    public void sacar(int saque){
        if (saldo >= saque){
            saldo = saldo-saque;
            System.out.println("Saque realizado com sucesso!"+"\nSaldo atual= "+saldo);  
        }else{
            System.out.println("Saldo insufuciente!");
        }
    }
}