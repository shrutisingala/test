import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Details\nName: ");
		String nam = s.nextLine();
		
		System.out.println("ID: ");
		int id = s.nextInt();
		
		System.out.println("Salary: ");
		double sal = s.nextDouble();
		
		System.out.println("Age: ");
		int age = s.nextInt();
		
		Employee e = new Employee(id,sal,age,nam);
		
		s.close();
		return e;
		
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);

	}

}
