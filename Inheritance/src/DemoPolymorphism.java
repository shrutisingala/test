import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//super class reference = sub class object

		Person e = new Employee();
		((Employee)e).display(10);

	}

}

class DemoEmployee {
	
	public Person printEmployee() {
		return null;
	}
	
}

class DemoChild extends DemoEmployee {
	public Employee printEmployee() {
		return null;
	}
}
