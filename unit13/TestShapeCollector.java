import java.util.ArrayList;

public class TestShapeCollector{
    public static void main(String[] args){
        ShapeCollection collection = new ShapeCollection();
        
        collection.addShape(new Shape("Triangle", 3));
        collection.addShape(new Shape("Square", 4));
        collection.addShape(new Shape("Pentagon", 5));
        
        System.out.println("Triangle Number Of Sides: " + collection.numberOfSides("Triangle"));
        System.out.println("Average Number Of Sides" + collection.averageOfSides());
        
        ArrayList<Shape>evenShapes = collection.evenNumberOfSides();
        System.out.println("Even Number Of Sides: ");
        for(Shape shape : evenShapes){
            System.out.println(shape.getName() + ": " + shape.getNumberOfSides());
        }
    }
}