import com.myabstract.Shape;
import com.pojo.Employee;

public class DemoMyClass {
	
	public static void main(String []args) {
		
		EmployeeIO empIO = new EmployeeIO() {
			@Override
			public void writeEmployee(Employee employee) {
				
			}
			
			@Override
			public Employee readEmployee() {
				System.out.println("something");
				return null;
			}
		};
		
		empIO.readEmployee();
		Shape s = new Shape() {

			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
	}

}
