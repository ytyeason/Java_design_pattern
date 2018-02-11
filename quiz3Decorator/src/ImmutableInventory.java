
public class ImmutableInventory implements Inventory{
	final Inventory decoratedInventory;
	
	public ImmutableInventory(Inventory i){
		this.decoratedInventory = i;
	}

	@Override
	public String getName() {
		return this.decoratedInventory.getName();
	}

	@Override
	public void stock(Item pItem, int pQuantity) {
		// TODO Auto-generated method stub
		System.out.println("sorry you cannot change stock");
	}

	@Override
	public void dispose(Item pItem, int pQuantity) {
		// TODO Auto-generated method stub
		System.out.println("sorry you cannot change stock");
	}

	@Override
	public int available(Item pItem) {
		return this.decoratedInventory.available(pItem);
	}

	
	
}
