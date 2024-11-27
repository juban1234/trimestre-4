public class Application {
    public static void main(String[] args) {

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