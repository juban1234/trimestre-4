
public class Main {
	
	 public static void main(String[] args) {
	        HoyoCircular hoyo = new HoyoCircular(5);
	        PiezaCircular piezaCircular = new PiezaCircular(5);
	        System.out.println("Pieza circular encaja: " + hoyo.encaja(piezaCircular)); // true

	        PiezaRectangular rectanguloPequeño = new PiezaRectangular(3, 4); // Diagonal = 5
	        PiezaRectangular rectanguloGrande = new PiezaRectangular(10, 10); // Diagonal ≈ 14.14

	        // Usamos el adaptador para encajar piezas rectangulares
	        AdaptadorPiezaRectangular adaptadorRectPequeño = new AdaptadorPiezaRectangular(rectanguloPequeño);
	        AdaptadorPiezaRectangular adaptadorRectGrande = new AdaptadorPiezaRectangular(rectanguloGrande);

	        System.out.println("Rectángulo pequeño encaja: " + hoyo.encaja(adaptadorRectPequeño)); // true
	        System.out.println("Rectángulo grande encaja: " + hoyo.encaja(adaptadorRectGrande)); // false
	    }

}
