package herancaepolimorfismo;
import java.util.UUID;

public class Funcionario {
    private String nome;
    private double salario;
    private static int totalFunc = 0;
    private final String ID;
    
    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.ID = UUID.randomUUID().toString();
        totalFunc++;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public String getId(){
        return ID;
    }
    public static int getTotalFunc(){
        return totalFunc;
    }

    double calcularbonus(){
        return salario * 0.10;
    }  
}
