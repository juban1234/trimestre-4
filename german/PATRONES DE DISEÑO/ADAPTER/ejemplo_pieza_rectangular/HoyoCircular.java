class HoyoCircular {
    private double radio;

    public HoyoCircular(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encaja(PiezaCircular pieza) {
        return this.getRadio() >= pieza.getRadio();
    }
}
