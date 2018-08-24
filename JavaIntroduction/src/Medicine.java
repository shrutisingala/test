

public class Medicine {
	
	private String medicineName;
	private int medicinePrice;
	
	//access_specifier return_type func_medicineName()
	public void displayMedicine() {
		System.out.println("Name:" + getmedicineName() + "\nPrice:" + getmedicinePrice());
	}
	
	public Medicine() {
		medicinePrice=21;
		medicineName="iodine solution";
	}
	
	public Medicine(int medicinePrice, String medicineName) {
		this.medicinePrice=medicinePrice;
		this.medicineName=medicineName;
	}

	public int getmedicinePrice() {
		return medicinePrice;
	}

	public void setmedicinePrice(int medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public String getmedicineName() {
		return medicineName;
	}

	public void setmedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	
	public static void main(String[] args) {
		Medicine M = new Medicine();
		M.displayMedicine();
		
	}
	
}
	
