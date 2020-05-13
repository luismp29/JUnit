package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones.MesesTrabajoException;
import excepciones.NombreEmpleadoException;
import syspagos.Empleado;

public class TestMesesTrabajo {

	@Test
	public void EstablecerMesesEmpleado()
	{
		Empleado x = new Empleado();
		try
		{
			x.estableceMesesTrabajo("6");
		}
		catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(6,x.getMesesTrabajo());
	}

}
