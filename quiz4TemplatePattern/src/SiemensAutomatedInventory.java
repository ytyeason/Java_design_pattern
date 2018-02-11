
public class SiemensAutomatedInventory extends AutomatedInventory{

	public SiemensAutomatedInventory(String pName) {
		super(pName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void locate() {
		// TODO Auto-generated method stub
		System.out.println("Siemens located");
	}

	@Override
	public void grab() {
		// TODO Auto-generated method stub
		System.out.println("Siemens Grabbed");
	}

}
