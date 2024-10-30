public class prueva {


    private static Singleton instanciaUnica1;

    private void Singleton() {

    }

    // Método público estático que retorna la única instancia
    public static Singleton obtenerInstancia() {
        if (instanciaUnica1 == null) {

            instanciaUnica1 = new Singleton();
        }
        return instanciaUnica1;
    }


    public void mostrarMensaje() {
        System.out.println("¡Este es el único objeto Singleton!");
    }
}

