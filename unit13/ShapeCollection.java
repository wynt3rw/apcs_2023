import java.util.ArrayList;

public class ShapeCollection{
    private ArrayList<Shape>shapes;
    
    public ArrayList<Shape>evenNumberOfSides(){
        ArrayList<Shape>evenSidedShapes = new ArrayList<>();
        for(Shape shape : shapes){
            if(shape.getNumberOfSides() % 2 == 0){
                evenSidedShapes.add(shape);
            }
        }
        return evenSidedShapes;
    }
    
    public ShapeCollection(){
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    
    public int numberOfSides(String shapeName){
        for(Shape shape : shapes){
            if(shape.getName().equals(shapeName)){
                return shape.getNumberOfSides();
            }
        }
        return -1;
    }
    
    public double averageOfSides(){
        int totalSides = 0;
        for(Shape shape : shapes){
            totalSides += shape.getNumberOfSides();
        }
        return (double) totalSides / shapes.size();
    }

}