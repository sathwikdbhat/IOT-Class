public class patient {
    String patientName;
    int patientAge;
    String disease;
    String dateOfArrival;
    information info;
    payment pay;
	public patient(String patientName, int patientAge, String disease, String dateOfArrival,information info,payment pay) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.disease = disease;
		this.dateOfArrival = dateOfArrival;
		this.info=info;
		this.pay=pay;
	}
   

void patientDetails() {
	System.out.println("Name: "+this.patientName);
	System.out.println("Age: "+this.patientAge);
	System.out.println("Disease: "+this.disease);
	System.out.println("Date of Arrival: "+this.dateOfArrival);
	System.out.println("Block no: "+this.info.blockNo);
	System.out.println("Floor no: "+this.info.floorNo);
	System.out.println("ROOM no: "+this.info.roomNo);
	System.out.println("BED no: "+this.info.bedNo);
	System.out.println("Admission Fee: "+this.pay.admFee);
	System.out.println("registraion Fee: "+this.pay.regFee);
	System.out.println("Balance fee: "+this.pay.balFee);
}
public static void main(String[] args) {
	information info=new information('B',2,8,3);
	payment pay=new payment(500,3000,2500);
	patient p=new patient("ABC",45,"fewer","26/2/25",info,pay);
	p.patientDetails();
    }
}