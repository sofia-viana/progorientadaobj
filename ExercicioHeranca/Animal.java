package ExercicioHeranca;
import java.util.ArrayList;

public class Animal {
    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> abilities;

    public Animal (long id, String nome, 
    int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso= peso;
        this.abilities = new ArrayList<>();
        
    }

    public long getId(){
        return id;
    }    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }

    public ArrayList<String> getAbilities(){
        return abilities;
    }
    public void addAbility(String ability) {
        abilities.add(ability);
    }
    public String sound(){
        return "Som do animal";
    }
    public String performAbility(String ability) {
        if (abilities.contains(ability)) {
            return nome + " can " + ability;
        } else {
            return nome + " can't " + ability;
        }
    }
}

