
public class fooditem extends Item implements visitable{

	public fooditem(String pName, int pId, int pPrice) {
		super(pName, pId, pPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
