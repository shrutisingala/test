import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileReader reader = new FileReader("abc.txt");
			byte value = 0;
			do {
				
				int data = reader.read();
				System.out.println((char)data);
				value=(byte)data;
				
			}while(value!=-1);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
