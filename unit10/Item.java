public class Item{
    private String name;
    private float price;
    
    public Item(String name, float price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void updatePrice(float price){
        this.price = price;
    }
}