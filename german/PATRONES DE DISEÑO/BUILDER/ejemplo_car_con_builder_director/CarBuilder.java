class CarBuilder implements Builder {
    private String brand;
    private String model;
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    @Override
    public void reset() {
        this.brand = "";
        this.model = "";
        this.seats = 0;
        this.engine = null;
        this.tripComputer = false;
        this.gps = false;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    @Override
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