import java.util.ArrayList;

public class TestAnimalCalculator{
    public static void main(String[] args){
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Human("Valerie", 2));
        animals.add(new Cat("Moomoo"));
        animals.add(new Sponge("Spongebob"));
        animals.add(new Centipede("Creep", 100));
        
        System.out.println("Animal Details: ");
        AnimalCalculator.printAnimalDetails(animals);
        
        double averageLegs = AnimalCalculator.calculateAverageLegs(animals);
        System.out.println("Average Legs: " + averageLegs);
        
        Animal withFewestLegs = AnimalCalculator.findFewestLegs(animals);
        System.out.println("Fewest Legs: " + withFewestLegs.getName() + " with " + withFewestLegs.getLegCount() + "legs.");
    }
}