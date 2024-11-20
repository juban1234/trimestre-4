interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);
    Car getProduct();
}