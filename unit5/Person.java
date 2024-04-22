public class Person{
    public String name;
    public int numberOfPets;
    
    public Person(String nameIn, int numberOfPetsIn){
        name = nameIn;
        numberOfPets = numberOfPetsIn;
    }
    
    
    public String getName(String nameIn){
        return name;
    }
    
    public int getNumberOfPets(int numberOfPetsIn){
        return numberOfPets;
    }
    
    public void greetings(){
        System.out.println("Hello, my name is " + name + ", and I have " + numberOfPets + " pets,");
    }
}