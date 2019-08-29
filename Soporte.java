package com.senati.mediateca;

public class Soporte {
//atributos de la clase soprte
	
	public int id;
	public String titulo;
	public 	String autor;
	public float precio;
	
	//consatructores con atributos
	public Soporte(int id, String titulo, String autor, float precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	//constructores sin atribituores
	
	public Soporte() {
		super();
	}
	//getters y settters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//tostring

	@Override
	public String toString() {
		return "Soporte [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	
}
