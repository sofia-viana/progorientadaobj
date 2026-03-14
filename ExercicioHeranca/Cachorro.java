package ExercicioHeranca;

public class Cachorro extends Animal {
    public Cachorro (long id, int idade, double peso) {
        super(id, "Buddy", idade, peso);
        addAbility("Sniff");
    }
    public String sound(){
        return "au";
    }  
}
