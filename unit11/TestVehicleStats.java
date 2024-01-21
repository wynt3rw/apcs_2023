import java.util.ArrayList;

public class TestVehicleStats{
    public static void main(String[] args){
        ArrayList<Vehicle>vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());
        
        int totalWheels = VehicleStats.calculateTotalWheels(vehicles);
        System.out.println("Total Wheels: " + totalWheels);
        
        ArrayList<Vehicle>humanPoweredVehicles = VehicleStats.getHumanPoweredVehicles(vehicles);
        System.out.println("Human Powered Vehicles: ");
        for(Vehicle vehicle : humanPoweredVehicles){
            System.out.println(vehicle.name());
        }
    }
}