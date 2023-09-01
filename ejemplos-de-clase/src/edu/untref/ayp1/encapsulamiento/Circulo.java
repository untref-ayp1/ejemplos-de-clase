package edu.untref.ayp1.encapsulamiento;

public class Circulo {
	private double radio;
	
	public Circulo(double radioInicial) {
		radio = radioInicial;
	}
	
	public double obtenerRadio() {
		return radio;
	}
	
	public double obtenerDiametro() {
		return radio * 2;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double obtenerArea() {
		return Math.PI * radio * radio;
	}
}
