import java.util.ArrayList;
import java.util.Collections;

public class ListaProductos {
private ArrayList<Producto> ListadoProductos = new ArrayList<Producto>();

public ListaProductos() {
	listaBase();
}
public ListaProductos(ArrayList<Producto> listado) {
	this.ListadoProductos=listado;
}
public ArrayList<Producto> getListadoProductos() {
	return ListadoProductos;
}

public void setListadoProductos(ArrayList<Producto> listadoProductos) {
	ListadoProductos = listadoProductos;
}

public void inlcuirProducto(Producto p) {
	this.ListadoProductos.add(p);
}
private void listaBase() {
	this.ListadoProductos.add(new Producto("Coca-cola Zero", 1.5,"Litros", 20));
	this.ListadoProductos.add(new Producto("Coca-cola", 1.5,"Litros", 18));
	this.ListadoProductos.add(new Producto("Shampoo Sedal", 500,"ml", 19));
	this.ListadoProductos.add(new Producto("Frutillas", 1,"kilo", 64));
}
public void imprimirListado() {
	
	for (Producto opc : ListadoProductos) {
		System.out.println(opc.toString());
	}
	System.out.println("=============================");
}

public void MayorYMenor() {
	Collections.sort(ListadoProductos);
	System.out.println("Producto mas caro: "+ListadoProductos.get(ListadoProductos.size()-1).getNombre());
	System.out.println("Producto mas barato: "+ListadoProductos.get(0).getNombre());
}
}
