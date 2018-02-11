
public class WeekendVisitor implements Visitor{

	private double tax;
	@Override
	public void visit(fooditem a)
	{
		// TODO Auto-generated method stub
		int p = a.getPrice();
		double t = p * 0.2;
		tax = tax + t;
	}

	@Override
	public void visit(furnitureItem a)
	{
		// TODO Auto-generated method stub
		int p = a.getPrice();
		double t = p * 0.12;
		tax = tax + t;
	}
	
	public double getTax(){
		return tax;
	}

}
