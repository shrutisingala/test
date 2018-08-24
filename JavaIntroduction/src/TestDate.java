
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		Date date2 = new Date(20, "September", 1996);
		
		date1.display();
		date2.display();
		
		date1.setDay(20);
		date1.setMonth("March");
		
		System.out.println("\nmodified\n");
		
		date1.display();
		

	}

}
