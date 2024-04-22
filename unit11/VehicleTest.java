import java.util.ArrayList;

public class VehicleTest{
    public static void main(String[] args){
        ArrayList<Vehicle>vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());
        
        for(Vehicle vehicle : vehicles){
            System.out.println("Name: " + vehicle.name());
            System.out.println("Wheel Count: " + vehicle.wheelCount());
            System.out.println("Human Powered: " + vehicle.isHumanPowered());
        }
    }
}