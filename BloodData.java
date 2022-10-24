class BloodData {

	private String bloodType;
	private String rhFactor;

public BloodData(){
	this.bloodType = "O";
	this.rhFactor = "+";
}
public void setBloodType(String newBType){
this.bloodType = newBType;
}
public void setRhFactor(String rh){
this.rhFactor = rh;
}
public String getBloodType(){
return bloodType;
}
	public String rhFactor(){
return bloodType;
}
public String getRhFactor(){
return rhFactor;
}

public void display(){
	System.out.println(bloodType + rhFactor + " is added to the Blood Bank.");
	}
	
	}