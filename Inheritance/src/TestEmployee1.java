import java.util.Scanner;

import com.pojo.Employee;
//import com.pojo.Person;

public class TestEmployee1 {

	public static void main(String[] args) {
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
		
		Employee emp1 = new Employee(id, sal, age, nam);
		
		emp1.display();
		s.close();
		

	}

}
