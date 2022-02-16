package menu;

import java.util.Vector;

import menu.MenuItem;

public class Oder {
	
	private int size;
	private Vector<MenuItem> list;
	
	public Oder() {
		this.size = 0;
		list = new Vector<MenuItem>();
	}
	
	public void addItem(MenuItem i) {
		list.add(i);
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public double getTotal() {
		double sum = 0;
		for(MenuItem i : list) {
			sum += i.getPrice();
		}
		return sum;
	}
	

}
