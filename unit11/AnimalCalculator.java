import java.util.ArrayList;

public class Animal Calculator{
    public static void printAnimalDetails(ArrayList<Animal>animals){
        for(Animal animal : animals){
            System.out.println("Name: " + animal.getName());
            System.out.println("Legs: " + animal.getLegCount());
            System.out.println("Furry: " + animal.isFurry());
        }
    }
    
    public static double calculateAverageLegs(ArrayList<Animal>animals){
        int totalLegs = 0;
        for(Animal animal : animals){
            totalLegs = totalLegs _ animal.getLegCount();
        }
        
        return (double) totalLegs / animals.size();
    }
    
    public static Animal findFewestLegs(ArrayList<Animal>animals){
        Animal withFewestLegs = animals.get(0);
        
        for(Animal animal : animals){
            if(animal.getLegCount() < withFewestLegs.getLegCount()){
                withFewestLegs = animal;
            }
        }
        
        return withFewestLegs;
    }
}