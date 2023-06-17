package Clases;

public class Cliente {
	
	//Atributos
	private int documento;
	private int telefono;
	private String nombre;
	private static int contar = 0;
	
	
	//Constructores
	
	public Cliente() {
		contar();
	}
	
	public Cliente(int documento, int telefono, String nombre) {
		this.documento = documento;
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	//Metodos

	public void mostrarCliente() {
		System.out.println(this.documento + " " + this.nombre + " "+ this.telefono);
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private static void contar() {
		contar += 1;
	}
	
	public static int getContar() {
		return contar;
	}
	
	
	
}
