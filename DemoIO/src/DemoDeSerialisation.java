import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSerialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fi;
		try {
			fi = new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj1 = oi.readObject();
			Object obj2 = oi.readObject();
			Student stu1 = (Student)obj1;
			Student stu2 = (Student)obj2;
			System.out.println(stu1.getName() + "\t" + stu1.getTotal() + "\t" + stu1.getRollNo());
			System.out.println(stu2.getName() + "\t" + stu2.getTotal() + "\t" + stu2.getRollNo());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
