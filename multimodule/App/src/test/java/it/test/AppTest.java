package it.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void testGetPippoNull() {
		App app = new App();
		assertNull(app.getPippo());
	}


	@Test
	public void testSetGetPippo() {
		App app = new App();
		app.setPippo("pippo");
		assertEquals("pippo",app.getPippo());

	}
}
