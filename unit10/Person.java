public class Person{
    private String name;
    private int pets;
    
    public Person(String name, int pets){
        this.name = name;
        this.pets = pets;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPets(){
        return pets;
    }
    
    public void updatePets(int pets){
        this.pets = pets;
    }
}