class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportsCar() {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine("SportEngine"));
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV() {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(new Engine("SUVEngine"));
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
