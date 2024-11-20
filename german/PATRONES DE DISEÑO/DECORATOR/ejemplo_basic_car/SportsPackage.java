
class SportsPackage extends CarDecorator {
    public SportsPackage(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return car.cost() + 5000.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Sports Package";
    }
}