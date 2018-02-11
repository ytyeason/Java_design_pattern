package commandPattern;

public class lightOnCommand implements Command{

	@Override
	public void execute() {
		System.out.println("turned on");
	}

}
