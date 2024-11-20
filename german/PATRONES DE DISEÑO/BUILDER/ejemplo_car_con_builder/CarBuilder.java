public class CarBuilder {
    private String brand;
    private String model;
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public void reset() {
        this.brand = "";
        this.model = "";
        this.seats = 0;
        this.engine = null;
        this.tripComputer = false;
        this.gps = false;
    }

    public CarBuilder setSeats(int seats) { 
        this.seats = seats;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {  
        this.engine = engine;
        return this;
    }

    public CarBuilder setTripComputer(boolean tripComputer) {  
        this.tripComputer = tripComputer;
        return this;
    }

    public CarBuilder setGPS(boolean gps) {  
        this.gps = gps;
        return this;
    }

    public Car getProduct() {
        Car car = new Car(brand, model, seats, engine, tripComputer, gps);
        reset();
        return car;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
}