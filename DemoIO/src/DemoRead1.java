import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("please enter two numbers: ");
//			String name = br.readLine();
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			if (num1>num2)
				System.out.println(num1 + " is greater than " + num2);
			else if (num1<num2)
				System.out.println(num2 + " is greater than " + num1);
			else
				System.out.println("both numbers are equal");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
