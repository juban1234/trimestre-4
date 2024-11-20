public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println(basicCar.getDescription() + " $ " + basicCar.cost());

        Car basicCarWithSportsPackage= new SportsPackage(new BasicCar());
        System.out.println(basicCarWithSportsPackage.getDescription() + " $ " + basicCarWithSportsPackage.cost());
    }
}