package com.senati.mediateca;

public class Cintavideo extends Soporte {
	//Para heredear atributos de una clase superior
	// extends superclase
	
	String actores ;
	String duracion;
	//constructores llenos
	public Cintavideo(int id, String titulo, String autor, float precio, String actores, String duracion) {
		super(id, titulo, autor, precio);
		this.actores = actores;
		this.duracion = duracion;
	}	
	//constructore vacios
	public Cintavideo() {
		super();
	}
	//string
	
		@Override
		public String toString() {
			return "Cintavideo [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
					+ ", autor=" + autor + ", precio=" + precio + "]";
		}
	//gueters y settters
		public String getActores() {
			return actores;
		}
		public void setActores(String actores) {
			this.actores = actores;
		}
		public String getDuracion() {
			return duracion;
		}
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}
	
	
		
}
