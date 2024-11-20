public class Application {
    public static void main(String[] args) {
        // Crear un coche sin patrón Builder
        Car carWithoutBuilder = new Car("Ford", "Fiesta", 5, new Engine("FordEngine"), true, true);
        System.out.println("Car without Builder: " + carWithoutBuilder);


        CarBuilder builder = new CarBuilder();
        
        Car deportivo = builder
            .setBrand("Ferrari")
            .setModel("F8 Tributo")
            .setSeats(2)
            .setEngine(new Engine("V8 Twin-Turbo"))
            .setTripComputer(true)
            .setGPS(true)
            .getProduct();
            
        System.out.println(deportivo);
      
    }
}