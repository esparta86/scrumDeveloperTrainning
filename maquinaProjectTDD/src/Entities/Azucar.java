package Entities;

public class Azucar {
	int reserva;
	public Azucar(int cucharas) {
		this.reserva = cucharas;
	}
	
	public boolean hazAzucar(int unidades) {
		if(reserva > unidades)
			return true;
		
		return false;
	}
	
	public boolean darAzucar(int unidades) {
		if(this.reserva < unidades) {
			return false;
		}else {
			this.reserva = this.reserva - unidades;
			return true;
		}
	}
	
	public int obtenerReserva() {
		return this.reserva;
	}

}
