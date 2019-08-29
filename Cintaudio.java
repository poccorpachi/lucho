package com.senati.mediateca;

public class Cintaudio extends Soporte{
	//Para heredear atributos de una clase superior
	// extends superclase
		
		String lugar;
		String direccion;
		
		
		//constructores llenos

		public Cintaudio(int id, String titulo, String autor, float precio, String lugar, String direccion) {
			super(id, titulo, autor, precio);
			this.lugar = lugar;
			this.direccion = direccion;
		}
		//constructore vacios
		public Cintaudio() {
			super();
		}
		//tostirng
		
		@Override
		public String toString() {
			return "Cintaudio [lugar=" + lugar + ", direccion=" + direccion + ", id=" + id + ", titulo=" + titulo
					+ ", autor=" + autor + ", precio=" + precio + "]";
		}
		
		//guetters y setterts
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}


		
}
