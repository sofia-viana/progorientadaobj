package Atv1ponto;

public abstract class Material implements Exibivel {
    protected int codigo;
    protected String titulo;
    protected int quantidade;

    public Material (int codigo, String titulo, int quantidade){
        this.codigo = codigo;
        this.titulo = titulo;
        this.quantidade = quantidade;
    }
    public int getCodigo(){
        return codigo;
    }
    public boolean disponivel(){
        return quantidade > 0;
    }
    public void emprestar(){
        quantidade--;
    }
    public void devolver(){
        quantidade++;
    }
    public String exibirResumo(){
        return titulo+ " | Qtd: " + quantidade;
    }  
}
