package ExercicioHeranca;

public class Gato extends Animal {
    public Gato (long id, int idade, double peso) {
        super(id, "Whiskers", idade, peso);
        addAbility("agility");
    }
    public String sound(){
        return "meow";
    }  
}
