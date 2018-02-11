import java.util.Random;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final int MAX_STOCK = 50;
	private static final fooditem ITEM_CEREAL = new fooditem("Cereal", 1, 200);
	private static final fooditem ITEM_JAM = new fooditem("Jam", 2, 400);
	private static final furnitureItem ITEM_BUTTER = new furnitureItem("Butter", 3, 250);
		
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		WeekDayVisitor w = new WeekDayVisitor();
		for (Item i:ITEMS){
			i.accept(w);
		}
		double d = w.getTax();
		System.out.println(d);
	}
}