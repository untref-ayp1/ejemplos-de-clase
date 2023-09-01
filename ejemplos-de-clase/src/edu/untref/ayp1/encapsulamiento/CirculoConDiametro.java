package edu.untref.ayp1.encapsulamiento;

public class CirculoConDiametro {
	private double diametro;
	private double PI = Math.PI;
	
	public CirculoConDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double obtenerRadio() {
		return this.diametro / 2;
	}
	
	public double obtenerDiametro() {
		return this.diametro;
	}
	
	public double obtenerPerimetro() {
		return 2 * PI * this.obtenerRadio();
	}
	
	public double obtenerArea() {
		return PI * this.obtenerRadio() * this.obtenerRadio();
	}
}
