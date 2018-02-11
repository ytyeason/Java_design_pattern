
public interface Inventory {
	public String getName();
	public void stock(Item pItem, int pQuantity);
	public void dispose(Item pItem, int pQuantity);
	public int available(Item pItem);
}
