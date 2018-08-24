import java.util.Scanner;

import com.one.MyClass;
import com.pojo.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		s.setName(scan.nextLine());
		System.out.println("Enter number of marks:");
		int num = scan.nextInt();
		int [] temp_marks;
		temp_marks = new int[num];
				
		System.out.println("Enter marks:");
		for(int x:temp_marks) {
			scan.nextInt();
		}
		
		

	}

}
