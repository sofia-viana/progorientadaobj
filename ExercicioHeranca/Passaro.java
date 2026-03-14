package ExercicioHeranca;

public class Passaro extends Animal{
    public Passaro(long id, int idade, double peso){
        super(id, "Tweety", idade, peso);
        addAbility("fly");
    }
    public String sound(){
        return "piu";
    }
}
