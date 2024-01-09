import java.util.ArrayList;

public class PersonStats{
    public static double averagePets(ArrayList<Person> personList){
        int totalPets = 0;
        
        for(Person person : personList){
            totalPets = totalPets + person.getPets();
        }
        
        return (double) totalPets / personList.size();
    }
    
    public static double testAveragePets(ArrayList<Person> personList, double expected){
        double result = averagePets(personList);
        
        for(Person person : personList){
            System.out.println("Average Expected: " + expected + ". Average Result: " + result);
        }

        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;     
    }
    
    public static String mostPets(ArrayList<Person> personList){
        int maxPets = 0;
        String withMostPets = " ";
        
        for(Person person : personList){
            if(person.getPets() > maxPets){
                maxPets = person.getPets();
                withMostPets = person.getName();
            }
        }
        
        return withMostPets;
    }
    
    public static String testMostPets(ArrayList<Person> personList, String expected){
        String result = mostPets(personList);
         
        for(Person person : personList){
            System.out.println("Most Pets Expected: " + expected + ". Most Pets Result: " + result);
        }

        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;   
    }
    
    public static ArrayList<Person> twoPets(ArrayList<Person> personList){
        ArrayList<Person> filterTwoPets = new ArrayList<>();
        
        for(Person person : personList){
            if(person.getPets() >= 2){
                filterTwoPets.add(person);
            }
        }
        
        return filterTwoPets;
    }
    
    public static ArrayList<Person> testTwoPets(ArrayList<Person> personList, ArrayList<Person> expected){
        ArrayList<Person> result = twoPets(personList);

        System.out.println("Two Pets Expected: " + expected);
        System.out.println("Two Pets Result: " + result);

        if (result.equals(expected)){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }

    return result;
}
    
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Eliot", 2));
        personList.add(new Person("Nirel", 4));
        personList.add(new Person("Scarlett", 3));

        testAveragePets(personList, 2);
        testMostPets(personList, "Nirel");

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(new Person("Eliot", 2));
        expected.add(new Person("Nirel", 4));
        expected.add(new Person("Scarlettt", 3));

        testTwoPets(personList, expected);
    }
}