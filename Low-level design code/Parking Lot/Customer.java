
public class Customer {
    private String name;
    private Vehicle vehicle;

    public Customer(String name, String vehicleNumber) {
        this.name = name;
        this.vehicle = new Vehicle(vehicleNumber);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

