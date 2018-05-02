public class PancakeHouseIterator implements Iterator {

	ArrayList<MenuItem> items;
	int position = 0;

    public PancakseHouseIterator(ArrayList<MenuItem> items) {
    	this.items = items;
    }

    public MenuItem next() {
    	MenuItem retVal = items.get(position);
    	position = position + 1;
    	return retVal
    }

    public boolean hasNext() {
    	return position < items.size() && items.get(position) != null;
    }

}
