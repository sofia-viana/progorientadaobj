public class ContaBancaria {
    String nomeT;
    int numDaConta;
    double saldo;

    ContaBancaria(String nome, int num, double s) {
        this.nomeT = nome;
        this.numDaConta = num;
        this.saldo = s;
    }
    void depositar (double valor) {
       if (valor >= 0){
        saldo +=valor;
        System.out.println("operação feita com sucesso");
       } else {
        System.out.println("erro!!!");
       }
    }
    void sacar (double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("operação realizada com sucesso");
        } else {
            System.out.println("op negada");
        }
    }
    void exibirSaldo() {
        System.out.println("Nome do titular: " + nomeT);
        System.out.println("Numero da conta: " + numDaConta);
        System.out.println("Saldo atual: "+saldo);
    }

}

