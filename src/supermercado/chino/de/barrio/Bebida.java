package supermercado.chino.de.barrio;

public class Bebida extends Producto{
	public Bebida(String n, String t,double c, double p) {
		super(n, t, c, p);
	}

	@Override
	public void mostrarDetalle() {
		System.out.println("Nombre: "+this.getNombre()+" /// "+this.getTipoUnidad()+": "+this.getCapacidad()+" /// " +"Precio: "+"$"+(int)this.getPrecio());
	}
}
