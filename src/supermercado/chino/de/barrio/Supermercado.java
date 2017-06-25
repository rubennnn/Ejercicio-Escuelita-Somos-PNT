package supermercado.chino.de.barrio;

import java.util.LinkedList;
import java.util.List;

public class Supermercado {
	private List<Producto> listaDeProductos;
	public Supermercado() {
		this.listaDeProductos=new LinkedList<>();
	}
	public void agregarProducto(Producto p){
		this.listaDeProductos.add(p);
	}
	
	
	public void cargarListaDeProductos() {
		Producto p1=new Bebida("Coca-Cola Zero", "Litros", 1.5, 20);
		Producto p2=new Bebida("Coca-Cola", "Litros", 1.5, 18);
		Producto p3=new Shampoo("Shampoo Sedal", "Contenido", 500, 30);
		Producto p4=new Fruta("Frutillas", "kilo", 1, 64);
		
		this.agregarProducto(p1);
		this.agregarProducto(p2);
		this.agregarProducto(p3);
		this.agregarProducto(p4);
	}
	public void mostrarProductos() {
		for ( Producto producto : listaDeProductos) {
			System.out.println("Nombre: "+producto.getNombre()+" /// "+producto.decirCapacidad()+" /// " +"Precio: "+"$"+(int)producto.getPrecio());
		}
		System.out.println("=============================");
	}
	public void productoMasCaro() {
		Producto max;
		max=this.listaDeProductos.get(0);
		for (Producto producto : listaDeProductos) {
			
			if (producto.compareTo(max)>0) {
				max=producto;
			}
		}
		
		System.out.println("Producto más caro: "+max.getNombre()); 
	}
	public void productoMasBarato() {
		Producto min;
		min=this.listaDeProductos.get(0);
		for (Producto producto : listaDeProductos) {
			
			if (producto.compareTo(min)<0) {
				min=producto;
			}
		}
		System.out.println("Producto más barato: "+min.getNombre());

	}
}
