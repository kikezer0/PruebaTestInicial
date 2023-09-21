package PaquetePrueba;

public class Cliente_noregistrado implements Cliente{
	private String nombre;
	private String apellido;
	private String DNI_NIF;
	private String telefono;
	private float saldo;
	private int descuento = 0;
	public Cliente_noregistrado() {
		super();
	}
	public Cliente_noregistrado(String nombre, String apellido, String dNI_NIF, String telefono, float saldo,
			int descuento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI_NIF = dNI_NIF;
		this.telefono = telefono;
		this.saldo = saldo;
		this.descuento = descuento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI_NIF() {
		return DNI_NIF;
	}
	public void setDNI_NIF(String dNI_NIF) {
		DNI_NIF = dNI_NIF;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
}
