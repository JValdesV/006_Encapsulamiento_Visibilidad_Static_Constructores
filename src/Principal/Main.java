package Principal;

import Clases.Cliente;
import Clases.Cuenta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos 2 objetos del package Clases
		//Creamos un cliente
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		//Creamos una cuenta
		Cuenta cuenta1 = new Cuenta();
		
		//Seteamos los datos del objeto cliente
		cliente1.setDocumento(123456789);
		cliente1.setTelefono(789789789);
		cliente1.setNombre("Javier");
		
		//Seteamos los datos del objeto cuenta
		cuenta1.setAgencia(1);
		cuenta1.setNumero(00555);
		cuenta1.setCliente(cliente1);
		
		//Consultamos los datos del objeto cuenta
		System.out.println(cuenta1.getCliente().getNombre());
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(cliente2.getContar());
		

	}

}
