package Atv1ponto;

public class Livro extends Material {
    protected String autor;
    public Livro(int codigo, String nome, int quantidade, String autor) {
        super(codigo, nome, quantidade);
        this.autor = autor;

    }
    public String getAutor(){
        return autor;
    }
     
}
