
public class Person {
	
	private int age;
	private String name;
	
	//access_specifier return_type func_name()
	public void display() {
		System.out.println("Name:" + name + "\nAge:" + age);
	}
	
	public Person() {
		age=21;
		name="Shruti";
	}
	
	public Person(int age, String name) {
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
	
	
}
