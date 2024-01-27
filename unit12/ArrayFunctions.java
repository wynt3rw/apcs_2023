public class ArrayFunctions{
    public static int smallestNumber(int[][] array){
        int smallest = array[0][0];
        for(int[] row : array){
            for(int value : row){
                if(value < smallest){
                    smallest = value;
                }
            }
        }
        
        return smallest;
    }
    
    public static float calculateSum(float[][] array){
        float sum = 0;
        for(float[] row : array){
            for(float value : row){
                sum = sum + value;
            }
        }
        
        return sum;
    }
    
    public static int countA(String[][] array){
        int count = 0;
        for(String[] row : array){
            for(String value : row){
                if(value.startsWith("A") || value.startsWith("a")){
                    count = count + 1;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        int[][] exampleOne = {
            {1, 2, 3},
            {5, 7, 9},
            {18, 21, 46}
        };
        
        int smallestValue = smallestNumber(exampleOne);
        System.out.println("Smallest Value: " + smallestValue);
        
        float[][] exampleTwo = {
            {1.5f, 2.5f, 3.5f},
            {4.6f, 6.9f, 8.5f},
            {19.2f, 23.6f, 31.9f}
        };
        
        float totalSum = calculateSum(exampleTwo);
        System.out.println("Total Sum: " + totalSum);
        
        String[][] exampleThree = {
            {"Fox", "Wolf", "Panda"},
            {"Solid", "Liquid", "Gas"},
            {"Monitor", "Microphone", "Keyboard"}
        };
        
        int startA = countA(exampleThree);
        System.out.println("Starts With A: " + startA);
    }
}