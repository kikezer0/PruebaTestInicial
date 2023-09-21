package PaquetePrueba;

public class Pelicula extends Producto{
	private Genero genero_pelicula;
	private String director;
	
	
	public Pelicula() {
		super();
	}

	
	public Pelicula(String titulo, float precio, int anyo_publicacion, int descuento_producto, Genero genero_pelicula,
			String director) {
		super(titulo, precio, anyo_publicacion, descuento_producto);
		this.genero_pelicula = genero_pelicula;
		this.director = director;
	}


	public Genero getGenero_pelicula() {
		return genero_pelicula;
	}

	public void setGenero_pelicula(Genero genero_pelicula) {
		this.genero_pelicula = genero_pelicula;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	
}
