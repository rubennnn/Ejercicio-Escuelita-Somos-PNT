package supermercado.chino.de.barrio;

public class Fruta extends Producto{
	public Fruta(String n, String t, double c, double p) {
		super(n, t, c, p);
	}

	@Override
	public void mostrarDetalle() {
		System.out.println("Nombre: "+this.getNombre()+" /// "+"Precio: "+"$"+(int)this.getPrecio()+" /// " +"Unidad de venta: "+this.getTipoUnidad());
	}
}
