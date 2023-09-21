package PaquetePrueba;

public class Cliente_registrado implements Cliente{
	private String nombre;
	private String apellido;
	private String DNI_NIF;
	private String telefono;
	private float saldo;
	private int descuento = 2;
	
	
	
	public Cliente_registrado() {
		super();
	}
	
	
	
	public Cliente_registrado(String nombre, String apellido, String dNI_NIF, String telefono, float saldo,
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



	public boolean valida_dni(String dni_nif) {
		if(dni_nif.length()==9)
			return true;
		else
			return false;
		
	}
	public boolean esVip(String apellido) {
		//Teniendo en cuenta que no hay una lista de vips en la prueba, crearé dos apellidos de 
		//clientes que puedan estar registrados para darle funcionamiento al método
		if(apellido.equalsIgnoreCase("Gómez") || apellido.equalsIgnoreCase("García") || apellido.equalsIgnoreCase(" Domínguez")
				|| apellido.equalsIgnoreCase("Sánchez"))
			return true;
		else
			return false;
	}
	
	public void actualizaDescuento(int numero) {
		setDescuento(numero);
	}
}
