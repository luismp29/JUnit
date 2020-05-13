package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.NombreEmpleadoException;
import excepciones.NumeroEmpleadoException;
import syspagos.Empleado;

public class TestNombreEmpleado {

	@Test
	public void EstablecerNomEmpleado()
	{
		Empleado x = new Empleado();
		try
		{
			x.estableceNombreEmpleado("Alberto");
		}
		catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Alberto",x.getNombreEmpleado());
	}


}
