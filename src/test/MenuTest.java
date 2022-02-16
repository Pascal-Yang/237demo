package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.MenuItem;

class MenuTest {

	@Test
	//this is an annotation to say that this is a test
	void test() {
		MenuItem item = new MenuItem(2.50); //set up for test
		double price = item.getPrice(); //test a method
		assertEquals(2.50, price, 0.05); //target, tested, toleration
	}
	
	void testGetName() {
		MenuItem item = new MenuItem(2.50,"bagel");
		String name = item.getName();
		assertTrue("bagel".equals(name));
	}

}
