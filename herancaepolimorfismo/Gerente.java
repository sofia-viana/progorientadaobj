package herancaepolimorfismo;

public class Gerente extends Funcionario {
    private String Departamento;

    public Gerente(String nome, double salario, String Departamento){
        super(nome, salario);
        this.Departamento = Departamento;
    }
    public String getDepartamento() {
        return Departamento;
    }
    double calcularbonusGerente(){
        return getSalario() * 0.20;
    }  
}
