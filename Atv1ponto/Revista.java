package Atv1ponto;

public class Revista extends Material {
    protected int edicao;
    public Revista(int codigo, String nome, int quantidade, int edicao){
        super(codigo, nome, quantidade);
        this.edicao = edicao;
    }
    public int getEdicao(){
        return edicao;
    }
    
}
