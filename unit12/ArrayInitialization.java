public class ArrayInitialization {
    private static void displayArrayA(String name, int[][] array){
        System.out.println(name + ":");
        for(int[] row : array){
            for(int element : row){
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void displayArrayB(String name, Object[][] array) {
        System.out.println(name + ":");
        for (Object[] row : array){
            for (Object element : row){
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void displayArrayC(String name, double[][] array){
        System.out.println(name + ":");
        for(double[] row : array){
            for(double element : row){
                System.out.println(element);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void displayArrayD(String name, int[][] array){
        System.out.println(name + ":");
        for(int[] row : array){
            for(int element : row){
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] arrayA = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 10; x++) {
                if (i == x) {
                    arrayA[i][x] = 1;
                } else {
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

        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 5; x++) {
                arrayC[i][x] = valueC;
                valueC = valueC + 1;
            }
        }

        int[][] arrayD = new int[6][5];
        for (int i = 0; i < 6; i = i + 1) {
            for (int x = 0; x < 5; x = x + 1){
                arrayD[i][x] = i + 1;
            }
        }

        displayArrayA("Array A", arrayA);
        displayArrayB("Array B", arrayB);
        displayArrayC("Array C", arrayC);
        displayArrayD("Array D", arrayD);
    }
}