package Clases;

public class Cuenta {
	//Atributos
	
		private double saldo = 10; //Atributo con campo por defecto
		private int agencia;
		private int numero ;
		private Cliente cliente;
		//Cliente cliente = new Cliente();
		
		//Constructores
		public Cuenta() {
		}
		
		public Cuenta(double saldo, int agencia, int numero, Cliente cliente) {
			this.saldo = saldo;
			this.agencia = agencia;
			this.numero = numero;
			this.cliente = cliente;
		}
		
		
		
		//Metodos Anotación camelCase
		
		public void deposita(double valor) {
			this.saldo += valor;
		}
		
		

		public boolean saca(double valor) {
			
			if(this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}else {
				return false;
			}
			
		}
		
		public boolean transfiere(double valor, Cuenta destino) {
			
			if(this.saldo >= valor) {
				//this.saldo -= valor;
				this.saca(valor);
				destino.deposita(valor);
				return true;
			}else {
				return false;
			}
			
		}
		
		public void mostrarSaldo() {
			System.out.println(this.saldo);
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
		
		
}
