package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.CargoException;
import excepciones.MesesTrabajoException;
import syspagos.Empleado;

public class TestDirectivo {

	@Test
	public void testEstablecerDirectivo() 
	{
		Empleado x = new Empleado();
		try
		{
			x.establecerSerDirectivo("--");
		}
		catch (CargoException ex) 
	    {
	    	fail();
	    }
	    assertEquals("--",x.getDirectivo());
	}

}
