package Atv1ponto;

public class Professor extends Usuario{ 
    public Professor(int codigo, String nome) {
        super(codigo, nome);
    }
    public int getLimite(){
        return 5;
    }
    public int getPrazo(){
        return 14;
    }
    public double getMulta(){
        return 1.0;
    }
}
