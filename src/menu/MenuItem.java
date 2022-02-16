package menu;

/**
 * A class
 * @author Pascal
 *
 */
public class MenuItem {

	private double price;
	private String name;
	
	/**
	 * Create a item with price=price.
	 * @param price is the price of the new item
	 */
	public MenuItem(double price){
		this.price = price;
		this.name = null;
	}
	
	/**
	 * Create an item
	 * @param price is the price
	 * @param name is the name
	 */
	public MenuItem(double price, String name){
		this.price = price;
		this.name = name;
	}
	
	/**
	 * @return the price of the item
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * @return the name of the item
	 */
	public String getName() {
		return this.name;
	}
	
}
