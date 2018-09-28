package Entities;

public class Vaso {
	
	int reserva;
	
	public Vaso(int vaso) {
		this.reserva = vaso;
	}
	
	public boolean tieneVaso(int unidades,int tipo) {
		if(reserva > unidades)
			return true;
		
		return false;
	}
	
	public boolean darVaso(int unidades) {
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
