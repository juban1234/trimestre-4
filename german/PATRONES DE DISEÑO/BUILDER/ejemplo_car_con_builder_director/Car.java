public class Car {
    private String brand;
    private String model;
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public Car(String brand, String model, int seats, Engine engine, boolean tripComputer, boolean gps) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}