package supermercado.chino.de.barrio;

public class Fruta extends Producto{
	public Fruta(String n, String t, double c, double p) {
		super(n, t, c, p);
	}

	@Override
	public String decirCapacidad() {
		return "Unidad de venta: "+this.getTipoUnidad();
	}
}
