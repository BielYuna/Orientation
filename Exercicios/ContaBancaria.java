public class ContaBancaria{
    /**Atributos Privados
     *Usa do encapsulamento para proteger os atributos desta classe **/
    private String numeroConta;
    private double saldo;
    private String titular;

      /**Construtor
     *Define como os objetos dessa classe serão criados **/
    public ContaBancaria(){
    }

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    /**Metodos Publicos
     *Metodos são os serviços que serão executados **/
    public void depositar(int saldo){
        try{
            if (saldo > 0){
                this.saldo = saldo + this.saldo;
                System.out.println("Deposito realizado com sucesso!"+"\nSaldo atual= "+(this.saldo + saldo));
                return;
            }else{
                System.out.println("Valor do deposito deve ser maior que zero!");
            }
        }catch(Exception erro){
            System.out.println("Erro ao depositar: "+erro.getMessage());
        }
    }
    public void sacar(int saque){
        if (saldo >= saque){
            saldo = saldo-saque;
            System.out.println("Saque realizado com sucesso!"+"\nSaldo atual= "+saldo);  
        }else{
            System.out.println("Saldo insufuciente!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual= "+saldo);
    }

    public void alterarTitular(String titular){
        try{
        if(titular.length() > 0){
            System.out.println("Titular alterado com sucesso de "+this.titular+" para "+titular);
            this.titular = titular;
        }else{
            System.out.println( "Titular nao pode ser vazio!" );
            }
        }catch(Exception erro){
            System.out.println("Erro ao alterar titular: "+erro.getMessage());
        }
    }

    public void dadosConta(){
        System.out.println("DADOS CLIENTE"+"\nTitular: "+titular+"\nNumero da conta: "+numeroConta+"\nSaldo: "+saldo);
        System.out.println("Teste de conexao com o GitHub!");
    }

    /**Metodos Getters e Setters
     *Define os metodos para requisitar e adicionar valores aos atributos **/
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }


}