public class Rectangle{
    private double base = 8.0;
    private double height = 10.0;
    private double perimeter;
    private double diagonal;
    
    public Rectangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }
    
    public double getBase(double baseIn){
        return base;
    }
    
    public double getHeight(double heightIn){
        return height;
    }
    
    public double findPerimeter(){
        double perimeter = base * 2 + height * 2;
        return perimeter;
    }
    
    public double findDiagonal(){
        double root = base * base + height * height;
        double diagonal = Math.sqrt(root);
        return diagonal;
    }
    
    public void total(){
        System.out.println("base: " + base);
        System.out.println("height: " + height);
        System.out.println("perimeter: " + perimeter);
        System.out.println("diagonal: " + diagonal);

    }
}