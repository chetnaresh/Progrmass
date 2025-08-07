abstract class Vehicle {
    private String plateNumber;
    private int tollAmount;

    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setTollAmount(int amount) {
        this.tollAmount = amount;
    }

    public int getTollAmount() {
        return tollAmount;
    }

    public abstract int calculateToll();
}

class Bike extends Vehicle {
    public Bike(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public int calculateToll() {
        setTollAmount(20);
        return getTollAmount();
    }
}

class Car extends Vehicle {
    public Car(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public int calculateToll() {
        setTollAmount(50);
        return getTollAmount();
    }
}

class Truck extends Vehicle {
    public Truck(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public int calculateToll() {
        setTollAmount(100);
        return getTollAmount();
    }
}

// ✅ Rename main class to avoid conflict
public class TollManagement {
    public static void processVehicle(Vehicle vehicle) {
        System.out.println("Vehicle Plate: " + vehicle.getPlateNumber());
        int toll = vehicle.calculateToll();
        System.out.println("Toll Collected: ₹" + toll);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        // Creating different vehicles
        Vehicle[] vehicles = {
                new Bike("KA01-BI-1234"),
                new Car("KA02-CA-5678"),
                new Truck("KA03-TR-9876"),
                new Car("KA04-CA-4321"),
                new Bike("KA05-BI-7654")
        };

        System.out.println("Toll Booth Simulation:");
        System.out.println("===============================");
        for (Vehicle v : vehicles) {
            processVehicle(v);
        }
    }
}
