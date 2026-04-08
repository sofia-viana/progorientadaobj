package Atv1ponto;

public class Aluno extends Usuario {
    public Aluno(int codigo, String nome){
        super(codigo, nome);
    }
    public int getLimite(){
        return 3;
    }
    public int getPrazo(){
        return 7;
    }
    public double getMulta(){
        return 2.5;
    }
    
}
