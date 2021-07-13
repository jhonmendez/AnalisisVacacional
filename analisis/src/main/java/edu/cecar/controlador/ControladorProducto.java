/**
 * @Clase: ControladorProducto.java
 * 
 * @version  0.1
 * 
 * @since 12/07/2021
 * 
 * @autor Ing. Juan Benavides
 *
 * @Copyrigth: CECAR
 */

package edu.cecar.controlador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.cecar.modelo.Producto;

/**
* clase que espeficica las funciones realisadas de las ventas 
* y compras de productos
*/
public class ControladorProducto {
	
	
		
	public	ControladorProducto() {
		Producto producto = new Producto("92","Pantalon","Pantalon de niño");
		Producto producto1 = new Producto("93","Camisa","Camisa de niño");
		Producto producto2 = new Producto("94","Medias","Medias de niño");
		
		
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(producto);
		productos.add(producto1);
		productos.add(producto2);
		
		Set<Producto> productosSet = new HashSet<Producto>();
		productosSet.add(producto);
		productosSet.add(producto1);
		productosSet.add(producto2);
		
		System.out.println("Tamaño coleccion list"+ productos.size());
		System.out.format("Tamaño coleccion lis %s", productosSet.size());
		System.out.println("Elementos coleccion list");
		
		for (Producto productoItem : productos) {
			System.out.println(productoItem);
			
		}
		System.out.println("Elementos coleccion set");
		for (Producto productoItem : productosSet) {
			System.out.println(productoItem);
		}
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(4);
		numeros.add(2);
		numeros.add(4);
		for (Integer integer : numeros) {
			System.out.println(numeros);
			
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		Set<Integer> numerosSet = new HashSet<Integer>();
		numerosSet.add(1);
		numerosSet.add(2);
		numerosSet.add(4);
		numerosSet.add(2);
		numerosSet.add(4);
		
		for (Integer integer : numerosSet) {
			System.out.println(numerosSet);
			
		}
		
	
	}

}
