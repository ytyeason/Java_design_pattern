
public class WeekDayVisitor implements Visitor{

	private double tax;
	@Override
	public void visit(fooditem a)
	{
		// TODO Auto-generated method stub
		int p = a.getPrice();
		double t = p * 0.01;
		tax = tax + t;
	}

	@Override
	public void visit(furnitureItem a)
	{
		// TODO Auto-generated method stub
		int p = a.getPrice();
		double t = p * 0.1;
		tax = tax + t;
	}
	
	public double getTax(){
		return tax;
	}

}
