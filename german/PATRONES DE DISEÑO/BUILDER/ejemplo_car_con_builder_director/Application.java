public class Application {
    public static void main(String[] args) {
        // Crear un coche sin patrón Builder
        Car carWithoutBuilder = new Car("Ford", "Fiesta", 5, new Engine("FordEngine"), true, true);
        System.out.println("Car without Builder: " + carWithoutBuilder);


        // Crear un coche con patrón Builder
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.setBuilder(builder);

        director.constructSportsCar();
        Car sportsCar = builder.getProduct();
        System.out.println("Sports Car: " + sportsCar);

        director.constructSUV();
        Car suv = builder.getProduct();
        System.out.println("SUV: " + suv);
    }
}