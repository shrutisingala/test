
public class DemoStatic {
	
	private float age;
	private String name;
	private static int value;
	
	public DemoStatic() {
		age = 21;
		name = "shruti";
		value = 30;
	}
	
	public DemoStatic(float age, String name) {
		this.age = age;
		this.name = name;
		value = 30;
	}

	static {
		value = 20;
	}
	
	public void display() {
		System.out.println(name + age +value);
	}
	
	public static void show()
	{
		System.out.println(value);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStatic.show();
		
		DemoStatic d = new DemoStatic();
		DemoStatic d1 = new DemoStatic();
		DemoStatic d2 = new DemoStatic();
		DemoStatic d3 = new DemoStatic();
	}
	
}