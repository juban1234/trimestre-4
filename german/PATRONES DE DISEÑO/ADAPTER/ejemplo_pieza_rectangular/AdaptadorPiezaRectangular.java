class AdaptadorPiezaRectangular extends PiezaCircular {
    private PiezaRectangular piezaRectangular;

    public AdaptadorPiezaRectangular(PiezaRectangular piezaRectangular) {
        super(0); // Llamada al constructor de la superclase con un radio inicial de 0
        this.piezaRectangular = piezaRectangular;
    }

    @Override
    public double getRadio() {
        // Calculamos el radio equivalente de un círculo que podría contener al rectángulo
        double ancho = piezaRectangular.getAncho();
        double alto = piezaRectangular.getAlto();
        return Math.sqrt((ancho * ancho) + (alto * alto)) / 2;
    }
}
