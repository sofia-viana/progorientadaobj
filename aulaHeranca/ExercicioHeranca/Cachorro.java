package aulaHeranca.ExercicioHeranca;

public class Cachorro {
    private String nome;
    private String raca;

    public Cachorro (String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public String getnome(){
        return nome;
    }
    public String getraca(){
        return raca;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    
    
    
}
