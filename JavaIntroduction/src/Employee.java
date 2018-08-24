
public class Employee {
	
	private int age;
	private String name;
	
	//access_specifier return_type func_name()
	public void showEmployeeDetails() {
		System.out.println("Name:" + getName() + "\nAge:" + getAge());
	}
	
	public Employee() {
		age=21;
		name="Shruti";
	}
	
	public Employee(int age, String name) {
		this.age=age;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee E = new Employee();
		E.showEmployeeDetails();
		E.setName("hello");
		E.setAge(34);
		E.showEmployeeDetails();
	}
	
	
}
