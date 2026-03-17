package herancaepolimorfismo;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }
    public String getLinguagem(){
        return linguagem;
    }
    double calcularbonusDesenvolvedor(){
        return getSalario() * 0.15;
    }
}
