public class TestRectangle{
    public static double calculateAveragePerimeter(Rectangle[][] rectangles){
        double totalPerimeter = 0;
        int rectangleCount = 0;
        
        for(Rectangle[] row : rectangles){
            for(Rectangle rectangle : row){
                totalPerimeter = totalPerimeter + rectangle.calculatePerimeter();
                rectangleCount = rectangleCount + 1;
            }
        }
        
        return totalPerimeter / rectangleCount;
    }
    
    public static Rectangle calculateGreatestArea(Rectangle[][] rectangles){
        Rectangle maxArea = rectangles[0][0];
        
        for(Rectangle[] row : rectangles){
            for(Rectangle rectangle : row){
                if(rectangle.calculateArea() > maxArea.calculateArea()){
                    maxArea = rectangle;
                }
            }
        }
        
        return maxArea;
    }
    
    public static void main(String[] args){
        Rectangle[][] exampleOne = {
            {new Rectangle("Rect1", 5.0, 7.0), new Rectangle("Rect2", 9.0, 11.0)},
            {new Rectangle("Rect3", 13.0, 15.0), new Rectangle("Rect4", 17.0, 19.0)}
        };
        
        double averagePerimeter = calculateAveragePerimeter(exampleOne);
        System.out.println("Average Perimeter: " + averagePerimeter);
        
        Rectangle greatestArea = calculateGreatestArea(exampleOne);
        System.out.println("Greatest Area: " + greatestArea);
    }
}