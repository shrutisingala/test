import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;



public class DemoSerialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name, roll number, total marks of first student: ");
		String name = s.nextLine();
		int roll = s.nextInt();
		int mrks = s.nextInt();
		
		Student student = new Student(roll,mrks,name);
		Student stud = new Student(1,1,"shru");
		
		try {
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(student);
			oo.writeObject(stud);
			oo.close();
			fo.close();
			
			System.out.println("operation done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
