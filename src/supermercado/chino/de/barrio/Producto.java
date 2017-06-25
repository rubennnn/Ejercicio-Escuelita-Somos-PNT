package supermercado.chino.de.barrio;

public abstract class Producto implements Comparable<Producto>{
	private String nombre;
	private String tipoUnidad;
	private double capacidad;
	private double precio;
	
	public Producto() {
		this.nombre=null;
		this.tipoUnidad=null;
		this.capacidad=0;
		this.precio=0;
	}
	
	public Producto(String n, String t, double c, double p) {
		this.nombre=n;
		this.tipoUnidad=t;
		this.capacidad=c;
		this.precio=p;
	}

	public String getNombre() {
		return nombre;
	}


	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	

	@Override
	public int compareTo(Producto o) {
		return this.getPrecio()>o.getPrecio()?1:this.getPrecio()<o.getPrecio()?-1:0;
		
	}
	public abstract String decirCapacidad();
}
