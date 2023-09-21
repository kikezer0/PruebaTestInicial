package PaquetePrueba;

public class Disco extends Producto{
	private Genero genero_musica;
	private String grupo;
	private int stock;
	
	public Disco() {
		super();
	}
	
	public Disco(String titulo, float precio, int anyo_publicacion, int descuento_producto, Genero genero_musica,
			String grupo, int stock) {
		super(titulo, precio, anyo_publicacion, descuento_producto);
		this.genero_musica = genero_musica;
		this.grupo = grupo;
		this.stock = stock;
	}


	public Genero getGenero_musica() {
		return genero_musica;
	}

	public void setGenero_musica(Genero genero_musica) {
		this.genero_musica = genero_musica;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
