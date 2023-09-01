package edu.untref.ayp1.encapsulamiento;

public class CirculoConDiametro {
	private double diametro;
	
	public CirculoConDiametro(double diametroInicial) {
		diametro = diametroInicial;
	}
	
	public double obtenerRadio() {
		return diametro / 2;
	}
	
	public double obtenerDiametro() {
		return diametro;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * this.obtenerRadio();
	}
	
	public double obtenerArea() {
		return Math.PI * obtenerRadio() * obtenerRadio();
	}
}
