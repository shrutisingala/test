
public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers;
//		numbers = new int[11];
		int [] numbers = {12,34,44,54,34,55,65,78,90,23,90};
//		numbers[0] = 12;
//		numbers[1] = 34;
//		numbers[2] = 44;
//		numbers[3] = 54;
//		numbers[4] = 34;
//		numbers[5] = 55;
//		numbers[6] = 65;
//		numbers[7] = 78;
//		numbers[8] = 90;
//		numbers[9] = 23;
//		numbers[10] = 90;
		
		
		
		int sum = add(numbers);
		
		System.out.println("Sum of the array: " + sum);
		
		System.out.println("normal for");
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("enhanced for");
		for(int x:numbers) {
			System.out.println(x);
		}
		
		System.out.println("while");
		int i=0;
		while(i<numbers.length) {
			System.out.println(numbers[i]);
			++i;
		}
		
		System.out.println("do-while");
		i=0;
		do {
			System.out.println(numbers[i]);
			++i;
		}while(i<numbers.length);

	}
	
	public static int add(int[] numbers) {
		return numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
	}

}
