import com.pojo.Employee;

import com.pojo.Person;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(123, 23000, 30, "abc");
//		emp.display();
		System.out.println(emp);
		
		Person p = new Person();
		System.out.println(p);
		
		Person p1 = new Person(21,"abc");
		Person p2 = new Person(21,"abc");
//		Person p2=p1;
		
		
//		System.out.println(p1.equals(p2));
		if (p1.equals(p2))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		
		EmployeeIOImpl empio = new EmployeeIOImpl();
		
		Employee empimpl = empio.readEmployee();
		empio.writeEmployee(empimpl);
		

	}

}
