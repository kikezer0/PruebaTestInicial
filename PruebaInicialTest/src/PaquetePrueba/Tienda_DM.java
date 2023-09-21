package PaquetePrueba;

import java.util.ArrayList;

public class Tienda_DM {
	private ArrayList<Producto> listaproductos;
	private ArrayList<Cliente> listaclientes;
	
	public Tienda_DM() {
		super();
	}

	public Tienda_DM(ArrayList<Producto> listaproductos, ArrayList<Cliente> listaclientes) {
		super();
		this.listaproductos = listaproductos;
		this.listaclientes = listaclientes;
	}
	
	
	public ArrayList<Producto> getListaproductos() {
		return listaproductos;
	}

	public void setListaproductos(ArrayList<Producto> listaproductos) {
		this.listaproductos = listaproductos;
	}

	public ArrayList<Cliente> getListaclientes() {
		return listaclientes;
	}

	public void setListaclientes(ArrayList<Cliente> listaclientes) {
		this.listaclientes = listaclientes;
	}

	/*public int buscaproducto(String titulo) {
		if(titulo.equalsIgnoreCase())
	}
	*/
	
	
	
}


