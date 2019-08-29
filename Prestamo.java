package com.senati.mediateca;

public class Prestamo {
		int id;
		int idsocio;
		int prestamo;
		int soporte;	
	//atributpos llenos
		public Prestamo(int id, int idsocio, int prestamo, int soporte) {
			super();
			this.id = id;
			this.idsocio = idsocio;
			this.prestamo = prestamo;
			this.soporte = soporte;
		}
		//atributos vacios
		
	public Prestamo() {
		super();
	}	
	//to string

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", idsocio=" + idsocio + ", prestamo=" + prestamo + ", soporte=" + soporte + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}

	public int getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(int prestamo) {
		this.prestamo = prestamo;
	}

	public int getSoporte() {
		return soporte;
	}

	public void setSoporte(int soporte) {
		this.soporte = soporte;
	}

	
	//gueters and setterts

}
