import java.util.Scanner;
public class Client {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter vehicle type  ");
        String vehicleType = reader.nextLine();
        

        // if(vehicleType.equalsIgnoreCase("car")) {
        //     Vehicle vehicle = new Car();
        //     vehicle.honks();
        //     System.out.println("Car object created.");
        // } else if(vehicleType.equalsIgnoreCase("bike")) {
        //     Vehicle vehicle = new Bike();
        //     vehicle.honks();
        //     System.out.println("Bike object created.");
        // } else {
        //     System.out.println("Invalid vehicle type.");
        // }         

        Vehicle v = VehicleFactory_SOLN.getVehicle(vehicleType);
        v.honks();     
}
}
