import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String test = s.nextLine();
		
		System.out.println("Hashcode of string: " + test.hashCode());
		System.out.println("Concatenated with citi: "+test.concat("citi"));
		System.out.println("Length of string: "+test.length());
		System.out.println("Upper case: "+test.toUpperCase());
		System.out.println("Substring from index 3: "+test.substring(3));
		
		String name1 = "citi";
		test = "citi";
		
		if (test == name1)
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");

	}

}
