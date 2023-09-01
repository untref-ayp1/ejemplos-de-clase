package edu.untref.ayp1.encapsulamiento;

public class Circulo {
	private double radio;
	private double PI = Math.PI;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double obtenerRadio() {
		return this.radio;
	}
	
	public double obtenerDiametro() {
		return this.radio * 2;
	}
	
	public double obtenerPerimetro() {
		return 2 * PI * this.radio;
	}
	
	public double obtenerArea() {
		return PI * this.radio * this.radio;
	}
}
