package Atv1ponto;

public class Ebook extends Material {
    protected String formato;
    protected double tamArq;
    public Ebook (int codigo, String nome, int quantidade, String formato, double tamArq){
        super(codigo, nome, quantidade);
        this.formato = formato;
        this.tamArq = tamArq;
    }
    public String getFormato(){
        return formato;
    }
    public double getTamArq(){
        return tamArq;
    }
    
}
