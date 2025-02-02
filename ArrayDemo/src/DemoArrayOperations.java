import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {123,34, 55, 65, 43, 55, 67,89,90};
		
//		Arrays.fill(numbers, 0);
//		
//		for (int num:numbers) {
////			System.out.println(num);
//		}
//		
		Arrays.fill(numbers, 2,5, 100);
		
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n***********COPY****************");
		
		
		
		int [] arr_copy = Arrays.copyOf(numbers, 5);
		
		for (int num:arr_copy) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n***********COMPARISON***********");
		
		String [] names = {"ABC", "DEF", "LMN"};
		String [] names1 = {"ABC", "DEF", "LMN"};
		
		boolean data = Arrays.equals(names, names1);
		if(data)
			System.out.println("Equal arrays");
		
		System.out.println("\n*********SORTING*********");
		
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		
		Arrays.sort(numbers);
		System.out.println("\n");
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n**********SEARCHING********");
		
		int index = Arrays.binarySearch(numbers, 8899);
		System.out.println("index = " +index);
		

	}

}
