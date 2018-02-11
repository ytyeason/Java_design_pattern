package commandPattern;

public class lightOffCommand implements Command{

	@Override
	public void execute() {
		System.out.println("tunred off");
	}

}
