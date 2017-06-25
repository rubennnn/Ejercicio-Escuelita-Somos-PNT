package supermercado.chino.de.barrio;

public class Shampoo extends Producto{
	public Shampoo(String n, String t, double c, double p) {
		super(n, t, c, p);
	}

	@Override
	public String decirCapacidad() {
		return "Contenido: "+(int)this.getCapacidad()+"mm";
	}
}
