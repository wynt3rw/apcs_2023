import java.util.ArrayList;

public class VehicleStats{
    public static int calculateTotalWheels(ArrayList<Vehicle>vehicles){
        int totalWheels = 0;
        for(Vehicle vehicle : vehicles){
            totalWheels = totalWheels + vehicle.wheelCount();
        }
        
        return totalWheels;
    }
    
    public static ArrayList<Vehicle> getHumanPoweredVehicles(ArrayList<Vehicle>vehicles){
        ArrayList<Vehicle>humanPoweredVehicles = new ArrayList<>();
        for(Vehicle vehicle : vehicles){
            if(vehicle.isHumanPowered()){
                humanPoweredVehicles.add(vehicle);
            }
        }
        
        return humanPoweredVehicles;
    }
}