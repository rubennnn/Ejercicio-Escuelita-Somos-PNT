package supermercado.chino.de.barrio;

public class Test {

	public static void main(String[] args) {
		Supermercado s=new Supermercado();
		s.cargarListaDeProductos();
		
		s.mostrarProductos();
		
		s.productoMasCaro();
		s.productoMasBarato();

	}

}
