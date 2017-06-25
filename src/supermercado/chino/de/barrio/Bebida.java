package supermercado.chino.de.barrio;

public class Bebida extends Producto{
	public Bebida(String n, String t,double c, double p) {
		super(n, t, c, p);
	}

	@Override
	public String decirCapacidad() {
		return this.getTipoUnidad()+": "+this.getCapacidad();
	}

}
