package maquinaProjectTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Entities.Vaso;

public class TestVaso {

	public Vaso vasoPequeno;
	public Vaso vasoGrande;
	public Vaso vasoMediano;
	@Before
	public void setUp() throws Exception {
		this.vasoPequeno =new  Vaso(5);
		this.vasoGrande =new  Vaso(5);
		this.vasoMediano =new  Vaso(5);
	}

	
	
	@Test
	public void deberiaDevolverVerdaderoSiExistenVasosPequeno(){
		boolean resultado = this.vasoPequeno.tieneVaso(1, 2);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deberiaDevolverVerdaderoSiExistenVasosMediano(){
		boolean resultado = this.vasoMediano.tieneVaso(1, 2);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deberiaDevolverVerdaderoSiExistenVasosGrande(){
		boolean resultado = this.vasoGrande.tieneVaso(1, 2);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSiNoExistenVasosPequeno(){
		boolean resultado = this.vasoPequeno.tieneVaso(10, 2);
		assertEquals(false, resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSiNoExistenVasosMediano(){
		boolean resultado = this.vasoMediano.tieneVaso(10, 2);
		assertEquals(false, resultado);
	}
	
	@Test
	public void deberiaDevolverFalsoSiNoExistenVasosGrande(){
		boolean resultado = this.vasoGrande.tieneVaso(10, 2);
		assertEquals(false, resultado);
	}
	
	public void deberiaRestarCantidadDeVasosPequenos() throws Exception  {
		if(this.vasoPequeno.darVaso(1)) {
			assertEquals(4, this.vasoPequeno.obtenerReserva());
		}else {
			throw new Exception("no valid test");
		}
	}

}
