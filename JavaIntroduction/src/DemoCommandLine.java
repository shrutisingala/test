//import java.lang.reflect.*;
//import java.util.*;

public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("number of arguments = " + args.length);
		System.out.println("argument:-" + args[0]);
//		System.out.println(args[0].getType());
		
		int sum =0;
		
		for (String x:args) {
			sum = sum + Integer.parseInt(x);
		
		}
		
		System.out.println(sum);

	}

}
