package PaquetePrueba;

import java.util.Iterator;
import java.util.Scanner;

public class AplicacionMain {

	public static void main(String[] args) {
		
		Tienda_DM Musicaycine = new Tienda_DM();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido a la tienda de música y películas más importante de Cádiz");
		System.out.println("-------MENU-------");
		System.out.println("Elige la opcion que desas realizar");
		System.out.println("1. Listar discos");
		System.out.println("2. Listar peliculas");
		System.out.println("3. Comprar una pelicula o disco");
		System.out.println("4. Listar los clientes");
		System.out.println("5. Salir del programa");
		
		
		int opcion = sc.nextInt();
		
		if(opcion==1) {
			System.out.println("Inserta el disco: ");
			System.out.println("Titulo: ");
			String titulo = sc.nextLine();
			System.out.println("Precio: ");
			float precio = sc.nextFloat();
			System.out.println("Año publicacion: ");
			int anyo_publicacion = sc.nextInt();
			System.out.println("Descuento: ");
			int descuento = sc.nextInt();
			System.out.println("Genero: ");
			String genero = sc.nextLine();
			Genero g=new Genero(genero);
			System.out.println("Nombre del grupo: ");
			String grupo = sc.nextLine();
			System.out.println("Cantidad de stock: ");
			int stock = sc.nextInt();
			//Musicaycine.getListaproductos().add(titulo, precio, anyo_publicacion, descuento, g,
			//grupo, stock); // Me da error el .add
		}
		else if(opcion==2) {
			//siguen las opciones pero no me ha dado tiempo
		}
		

	}

}
