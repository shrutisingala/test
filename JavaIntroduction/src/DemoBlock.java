
public class DemoBlock {
	
	public DemoBlock() {
		System.out.println("contructor invoked");
	}
	
	{
		System.out.println("non staticblock invoked");
	}
	
	static {
		System.out.println("static block invoked");
	}
	
	public void display() {
		System.out.println("display invoked");
	}
	
	public static void show() {
		System.out.println("static show function invoked");
	}
	
	public static void main(String [] args) {
		DemoBlock.show();
		DemoBlock d=new DemoBlock();
		DemoBlock d2=new DemoBlock();
		d.display();
	}
}
