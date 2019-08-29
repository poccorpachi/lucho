package com.senati.mediateca;

public class Libro extends Soporte {	
	//Para heredear atributos de una clase superior
	// extends superclase
	
	int nropag;
	int nroisbn;
	
	//constructores llenos
	public Libro(int id, String titulo, String autor, float precio, int nropag, int nroisbn) {
		super(id, titulo, autor, precio);
		this.nropag = nropag;
		this.nroisbn = nroisbn;
	}
	//constructores vacios
	
	public Libro() {
		super();
	}
	//to string
	@Override
	public String toString() {
		return "Libro [nropag=" + nropag + ", nroisbn=" + nroisbn + ", id=" + id + ", titulo=" + titulo + ", autor="
				+ autor + ", precio=" + precio + "]";
	}	
	
	
	
	
	
	
	
}
