public class PancakeHouseMenu {

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B's Pancake Breakfast",
			"Pancakse with Fried eggs, sausage",
			true,
			2.99);

		addItem("Regular Pncake Breakfast",
			"Panckes with fried eggs, sausage",
			false,
			2.99);

		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);

		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	// public ArrayList<MenuItem> getMenuItems() {
	// 	return menuItems;
	// }

	public Iterator createIterator() {
		return new PancakeHouseIterator();
	}

	//other menu methods here

}
