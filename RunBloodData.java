import java.util.Scanner;
public class RunBloodData {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Blood type of Patient: ");
	String input1 = sc.nextLine();
	
	System.out.print("Enter the Rhesus Factor (+ or -): ");
	String input2 = sc.nextLine();	
	
	if(input1.isEmpty()&&input2.isEmpty()){
	BloodData bd1 = new BloodData();
	bd1.display();
	}
	else if((input1.equals("A")||input1.equals("B")||input1.equals("AB")||input1.equals("C")||input1.equals("O"))&&(input2.equals("+")||input2.equals("-"))) {
		
	BloodData bd2 = new BloodData(input1, input2);
	bd2.display();
}
else {
	System.out.println("Invalid Blood Type.");
}
}
}
		
	
		
		
	
	
	
