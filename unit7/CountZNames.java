public class CountZNames{
    public static int countZNames(String[] names){
        int nameCount = 0;
        
        for(String name : names){
            if(name.startsWith("z") || name.startsWith("Z")){
                nameCount = nameCount + name.length();
            }
        }
        
        return nameCount;
    }
    
    public static int testCountZNames(String[] names, int expected){
        int result = countZNames(names);
        
        for(String name : names){
            System.out.print("Names: " + name + ". ");
        }
        
        System.out.println("Expected: " + expected + ". Result: " + result);

        
        if(result == expected){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid.");
        }
        
        return result;
    }
    
    public static void main(String[] args){
        String[] names1 = {"Dr. Kessner", "Mr. Allen", "Dr. Newby"};
        String[] names2 = {"Zorro", "Zippy", "Zero"};
        String[] names3 = {"Zephyr", "Andromeda", "Zaire"};
        
        testCountZNames(names1, 0);
        testCountZNames(names2, 14);
        testCountZNames(names3, 11);
    }
}