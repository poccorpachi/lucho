package com.senati.mediateca;

public class Socio{
int id;
String nombre;
String apellido;
String distrtio;
//constrcutro llenios
public Socio(int id, String nombre, String apellido, String distrtio) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.distrtio = distrtio;
}
//constructore vacios
public Socio() {
	super();
}
//to string
@Override
public String toString() {
	return "Socio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", distrtio=" + distrtio + "]";
}
//gueters and setterts
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDistrtio() {
	return distrtio;
}
public void setDistrtio(String distrtio) {
	this.distrtio = distrtio;
	
	////
	
	

}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
	result = prime * result + ((distrtio == null) ? 0 : distrtio.hashCode());
	result = prime * result + id;
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Socio other = (Socio) obj;
	if (apellido == null) {
		if (other.apellido != null)
			return false;
	} else if (!apellido.equals(other.apellido))
		return false;
	if (distrtio == null) {
		if (other.distrtio != null)
			return false;
	} else if (!distrtio.equals(other.distrtio))
		return false;
	if (id != other.id)
		return false;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
}

}
