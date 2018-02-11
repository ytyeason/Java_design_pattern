import java.util.ArrayList;

public class Manager implements Employee{
	private String name;
	private double salary;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	private ArrayList<Employee> eList;//aggregation
	public Manager(String pname, double pSalary){
		eList = new ArrayList<Employee>();
		this.name = pname;
		this.salary = pSalary;
	}
	
	public void add(Employee employee){
		this.eList.add(employee);
	}
	public void remove(Employee employee){
		this.eList.remove(eList.indexOf(employee));
	}
	public Employee getChild(int i){
		return eList.get(i);
	}
}
