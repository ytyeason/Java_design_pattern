

public class sellLogger implements SellLoggerObserver{

	@Override
	public void ItemRemoved(Item a, int q) {
		// TODO Auto-generated method stub
		System.out.println("item removed" + a.getId() + "quantity: "+q);
	}

}
