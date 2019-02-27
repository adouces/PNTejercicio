
public class Producto implements Comparable<Producto> {
private double contenido;
private String unidad;
private String nombre;
private double precio;

public Producto() {
	
}
public Producto(String nombre, double contenido, String unidad, double precio) {
	this.nombre=nombre;
	this.contenido=contenido;
	this.unidad=unidad;
	this.precio=precio;
}
public double getContenido() {
	return contenido;
}
public void setContenido(double contenido) {
	this.contenido = contenido;
}
public String getUnidad() {
	return unidad;
}
public void setUnidad(String unidad) {
	this.unidad = unidad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

@Override
public String toString() {
	switch(this.unidad) {
		case "Litros":
			return "Nombre: "+this.nombre+" /// Litros: "+String.format("%.1f",this.contenido)+" /// Precio: $"+String.format("%.0f",this.precio);
		case "ml":
			return "Nombre: "+this.nombre+" /// Contenido: "+String.format("%.0f",this.contenido)+"ml /// Precio: $"+String.format("%.0f",this.precio);
		case "kilo":
			return "Nombre: "+this.nombre+" /// Precio: $"+String.format("%.0f",this.precio)+" /// Unidad de venta: kilo";
		}
	return "Sin designar";
}
@Override
public int compareTo(Producto comp) {
	return Double.compare(this.precio,comp.precio);
}
}
