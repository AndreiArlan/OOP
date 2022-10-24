class BloodData {

	static String bloodType;
	static String rhFactor;

public BloodData(){
	this.bloodType = "O";
	this.rhFactor = "+";
}
public BloodData(String bt, String rh){
 	this.bloodType = bt;
	this.rhFactor =  rh;
}
public void display(){
	System.out.println(bloodType + rhFactor + " is added to the Blood Bank.");
	}
	
	}