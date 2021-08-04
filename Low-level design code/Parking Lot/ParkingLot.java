
import java.util.ArrayList;

public class ParkingLot {
    private String name;
    private int capacity;
    private String Location;

    public double getParkingCharges() {
        return parkingCharges;
    }

    private double parkingCharges;



    private Admin admin;

    private AutomatedSystem automatedSystem;
    private ArrayList<ParkingSpot> parkingSpots;
    private ArrayList<ParkingSpot> availableSpots;
    private DisplayBoard displayBoard;



    public ParkingLot(String name, int capacity, String location, double parkingCharges, AutomatedSystem automatedSystem, DisplayBoard displayBoard) {
        this.name = name;
        this.capacity = capacity;
        Location = location;
        this.parkingCharges = parkingCharges;
        this.automatedSystem = automatedSystem;
        this.automatedSystem.setParkingLot(this);
        this.displayBoard = displayBoard;
        this.parkingSpots = createParkingSpots(capacity);
        availableSpots = (ArrayList<ParkingSpot>) parkingSpots.clone();
    }
    private ArrayList<ParkingSpot> createParkingSpots(int capacity){
        ArrayList<ParkingSpot> tempList = new ArrayList<>();
        for (int i = 0; i <capacity ; i++) {
            ParkingSpot temp = new ParkingSpot("MPL "+i);
            tempList.add(temp);
        }
        return tempList;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public ParkingSpot getAvailableSpot() {
        return availableSpots.remove(0);
    }

    public int getAvailability(){
        return availableSpots.size();
    }

    public void updateParkingCharges(double newCharges){
        this.parkingCharges = newCharges;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public static void main(String[] args) {
        DisplayBoard displayBoard = new DisplayBoard();
        AutomatedSystem automatedSystem = new AutomatedSystem(1);
        ParkingLot myParkingLot = new ParkingLot("MyParkingLot",100, "Sec-135,Noida",50,automatedSystem,displayBoard);

        // Checking the availability of this parking Lot
        int availavility = myParkingLot.getAvailability();
        System.out.println(availavility);

        // Creating Customer
        Customer piyush = new Customer("Piyush","UP85 AX 5454");

        // Automated System Generating Ticket
        Ticket piyushTicket = myParkingLot.automatedSystem.generateTicket(piyush);

        // Printing Ticket Info
        System.out.println(piyushTicket);

        // Creating Customer
        Customer ayush = new Customer("Ayush","UP86 AB 9999");

        // Automated System Generating Ticket
        Ticket ayushTicket = myParkingLot.automatedSystem.generateTicket(ayush);

        // Printing Ticket Info
        System.out.println(ayushTicket);

    }

}

