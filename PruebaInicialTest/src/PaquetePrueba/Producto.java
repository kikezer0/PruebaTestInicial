package PaquetePrueba;

public abstract class Producto {
	private String titulo;
	private float precio;
	private int anyo_publicacion;
	private int descuento_producto = 0;
	public Producto() {
		super();
	}
	public Producto(String titulo, float precio, int anyo_publicacion, int descuento_producto) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.anyo_publicacion = anyo_publicacion;
		this.descuento_producto = descuento_producto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getAnyo_publicacion() {
		return anyo_publicacion;
	}
	public void setAnyo_publicacion(int anyo_publicacion) {
		this.anyo_publicacion = anyo_publicacion;
	}
	public int getDescuento_producto() {
		return descuento_producto;
	}
	public void setDescuento_producto(int descuento_producto) {
		this.descuento_producto = descuento_producto;
	}
	
}
