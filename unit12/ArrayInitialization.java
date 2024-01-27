public class ArrayInitialization{
    private static void displayArray(String name, Object[][] array){
        System.out.println(name + ":");
        for(Object[] row : array){
            for(Object element : row){
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }    
    
    public static void main(String[] args){
    
        int[][] arrayA = new int[10][10];
        for(int i = 0; i < 10; i = i + 1){
        for(int x = 0; x < 10; x = x + 1){
                if(i == x){
                    arrayA[i][x] = 1;
                } else{
                    arrayA[i][x] = 0;
                }
            }
        }
    
        String[][] arrayB = {
            {"Gold", "Silver", "Sapphire"},
            {"Monitor", "Microphone", "Keyboard"},
            {"Pencil", "Pen", "Highlighter"}
        };
    
        double[][] arrayC = new double[5][5];
        double valueC = 11.0;
    
        for(int i = 0; i < 5; i = i + 1){
            for(int x = 0; x < 5; x = x + 1){
                arrayC[i][x] = valueC;
                valueC = valueC + 1;
            }
        }
        
        int[][] arrayD = new int[6][5];
        int valueD = 101;
        
        for(int i = 0; i < 6; i = i + 1){
            for(int x = 0; x < 5; x = x + 1){
                arrayD[i][x] = valueD;
                valueD = valueD + 1;
            }
        }
        
        displayArray("Array A", arrayA);
        displayArray("Array B", arrayB);
        displayArray("Array C", arrayC);
        displayArray("Array D", arrayD);
    }
}