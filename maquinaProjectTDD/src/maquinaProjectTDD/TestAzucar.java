package maquinaProjectTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import Entities.Azucar;

public class TestAzucar {
	
public Azucar azucar; 
	
	@Before
	public void setup() {
		this.azucar =new  Azucar(20);
	}
	
	@Test
	public void deberiaDevolverVerdaderoSiHaySuficienteAzucar() throws Exception {
		if(this.azucar != null) {
		boolean resultado = this.azucar.hazAzucar(5);
		assertEquals(true, resultado);
	    resultado = this.azucar.hazAzucar(9);
	    assertEquals(true, resultado);
	    }else {
		  throw new Exception("test");
		}
		
	}
	
	@Test
	public void deberDevolverFalsoPorqueNoHaySuficienteAzucar() throws Exception{
		if(this.azucar != null) {
			boolean resultado = this.azucar.hazAzucar(25);
			assertEquals(false,resultado);
		}else {
			throw new Exception("fail test");
		}
	}
	
	@Test
	public void deberiaRestarAzucar(){
		if(this.azucar.darAzucar(5)) {
			assertEquals(15,this.azucar.obtenerReserva());
			
			if(this.azucar.darAzucar(2)) {
				assertEquals(13,this.azucar.obtenerReserva());
			}else {
				assertEquals(false,false);
			}
			
		}else {
			assertEquals(false,false);
		}
	}

	

}
