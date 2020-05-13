/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestPrima {

	@Test
	public void calculoDePrima()
	{
		Empleado x = new Empleado();
		try
		{
			x.estableceMesesTrabajo("7");
		}
		catch(MesesTrabajoException ex)
		{
			fail("Not yet implemented");
		}
		assertEquals("P1", x.getMesesTrabajo());
	}

}
