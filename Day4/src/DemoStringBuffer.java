
public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("citi 1");
		System.out.println("initial value:-"+builder);
		builder.append(",EON");
		
		System.out.println("newvalue: "+builder);
		
		builder.length();
		builder.hashCode();
		builder.reverse();
		System.out.println(builder);

	}

}
