package it.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2 {

	@Test
	public void testSetGetNullPippo() {
		App app = new App();
		app.setPippo(null);
		assertEquals("pluto",app.getPippo());

	}
}
