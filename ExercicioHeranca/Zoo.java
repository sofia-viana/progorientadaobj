package ExercicioHeranca;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal>animals;
    public Zoo(){
        animals = new ArrayList<>();
    }
    public void addAnimal (Animal animal) {
        animals.add(animal);
    }
    public ArrayList<Animal> listAnimals(){
        return animals;   
    }
    public boolean removeAnimal (long id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                animals.remove(animal);
                return true;
            }
        }
        return false;
    }
    
}
