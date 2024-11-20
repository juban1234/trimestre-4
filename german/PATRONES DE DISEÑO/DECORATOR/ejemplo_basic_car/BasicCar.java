
class BasicCar implements Car {
    @Override
    public double cost() {
        return 20000.0;
    }

    @Override
    public String getDescription() {
        return "Basic Car";
    }
}