package Atv1ponto;

public abstract class Usuario implements Exibivel {
    protected int codigo;
    protected String nome;
    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public abstract int getLimite();
    public abstract int getPrazo();
    public abstract double getMulta();

    public String exibirResumo(){
        return "Usuário: " +nome;
    }
}
