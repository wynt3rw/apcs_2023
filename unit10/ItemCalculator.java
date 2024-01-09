import java.util.ArrayList;

public class ItemCalculator{
    public static void printItems(ArrayList<Item> itemList){
        for(Item item : itemList){
            System.out.println("Item: " + item.getName() + ". Price: $ " + item.getPrice());
        }
    }
    
    public static float calculatePrice(ArrayList<Item> itemList){
        float total = 0;
        
        for(Item item : itemList){
            total = total + item.getPrice();
        }
        
        return total / itemList.size();
    }
    
    public static float testCalculatePrice(ArrayList<Item> itemList, float expected){
        float result = calculatePrice(itemList);
        
        for(Item item : itemList){
            System.out.println("Average Expected: " + expected + ". Average Result: " + result);
        }

        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;     
    }
    
    public static String returnExpensive(ArrayList<Item> itemList){
        float maxPrice = 0;
        String expensiveItem = " ";
        
        for(Item item : itemList){
            if(item.getPrice() > maxPrice){
                maxPrice = item.getPrice();
                expensiveItem = item.getName();
            }
        }
        
        return expensiveItem;
    }
    
    public static String testReturnExpensive(ArrayList<Item> itemList, String expected){
        String result = returnExpensive(itemList);
        
        for(Item item : itemList){
            System.out.println("Expected Expensive Item: " + expected + ". Result Expensive Item: " + result);
        }
        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;  
    }
    
    public static void main(String[] args){
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Microphone", 35.00f));
        itemList.add(new Item("Monitor", 110.00f));
        itemList.add(new Item("Keyboard", 65.00f));
        
        testCalculatePrice(itemList, 70.00f);
        testReturnExpensive(itemList, "Monitor");
    }
}