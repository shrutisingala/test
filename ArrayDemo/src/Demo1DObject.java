
public class Demo1DObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] persons;
		persons = new Person[5];
		persons[0] = new Person();
		persons[1] = new Person(21,"abc");
		persons[2] = new Person(22,"def");
		persons[3] = new Person(23,"wfwg");
		persons[4] = new Person(21,"aadf");
		
		persons[3].display();
		
		for(Person x:persons) {
			x.display();
		}
		
		

	}

}
