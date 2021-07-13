/**
 * @Clase: Producto.java
 * 
 * @version  0.1
 * 
 * @since 12/07/2021
 * 
 * @autor Ing. Juan Benavides
 *
 * @Copyrigth: CECAR
 */

package edu.cecar.modelo;

/**
* Clase que modela la compra y venta de la empresa ACME
*/
public class Producto {
	
	private String codigo;
	private String nombre;
	private String descripcion;
	
	public Producto() {
		
	}
	
	
	public Producto(String codigo, String nombre, String descripcion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		
		return "Codigo" + codigo + "\n" +
				"Nombre" + nombre + "\n" +
				"Descripcion" + descripcion;
	}

}
