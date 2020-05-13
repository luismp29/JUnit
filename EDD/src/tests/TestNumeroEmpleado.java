
package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestNumeroEmpleado {

	@Test
	public void EstablecerNEmpleado()
	{
		Empleado x = new Empleado();
		try
		{
			x.establecerNumeroEmpleado("7777");
		}
		catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(7777,x.getNumeroEmpleado());
	}

}
