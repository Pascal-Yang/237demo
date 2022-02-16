package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

import menu.MenuItem;
import menu.Oder;

import org.junit.jupiter.api.Test;

class oder_test {
	
	private Oder demo;
	private MenuItem chips;
	
	@Before
	void setup() {
		demo = new Oder();
		chips = new MenuItem(123, "chips");
		demo.addItem(chips);
	}

	@Test
	void test() {
		int items = demo.getSize();
		assertEquals(1, items);
	}
	
	@Test
	void testComputeTotal() {
		
		MenuItem fries = new MenuItem(12, "fries");
		demo.addItem(chips);
		demo.addItem(fries);
		double total = demo.getTotal();
		
		assertEquals(135, total);
		
	}

}
