public class VehicleFactory_SOLN {

    public static Vehicle getVehicle(String veString){
        if(veString.equalsIgnoreCase("Bike")){
            return new Bike();
        } else if(veString.equalsIgnoreCase("Car")){
            return new Car();
        }
        return null;
    }
    public static void main(String[] args) {
        
    }
}
