
public class DemoArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {12,34,44,54,34,55,65,78,90,23,90};
		
		for(int x:numbers) {
			System.out.println(x);
		}
		
		int i=0;
		int search = 55;
		
		boolean flag = false;
		while(i<numbers.length) {
			if (numbers[i]==search)
				flag = true;
			i++;
		}
		
		if (flag) {
			System.out.println("Found");
		}
		else {
			System.out.println("not found");
		}
		

	}

}
