
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"a","b","c"};
		
		int [][] values = new int[3][];
		
		values[0] = new int[4];
		values[0][0] = 1;
		values[0][1] = 2;
		values[0][2] = 3;
		values[0][3] = 4;
		
		values[1] = new int[2];
		values[1][0] = 5;
		values[1][1] = 6;
		
		values[2] = new int[3];
		values[2][0] = 7;
		values[2][1] = 8;
		values[2][2] = 9;
		
		for (int [] arr : values) {
			for(int v:arr) {
				System.out.print(v+"\t");
			}
			System.out.println();
		}

	}

}
