package quiz1;

public class Employee {
	public enum hey {a,b,c,d};
	private String name;
	private int id;
	
	public Employee(String name, int id){
		this.setName(name);
		this.setId(id);
	}

	public static String getName() {
		return "p";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
