//Brain class intakes the users symptoms, compares them to each of the diseases arrays from the database class and returns the output of which disease it is
import java.util.*;

public class Brain extends Database{
	
	String input;
	Scanner scan = new Scanner(System.in);
	boolean fever;
	boolean fatiuge;
	boolean smell;
	boolean congestion;
	boolean soreThroat;
	public boolean[] symptoms;
	
	public Brain() {
		super();
		fever = false;
		fatiuge = false;
		smell = false;
		congestion = false;
		soreThroat = false;
		symptoms = new boolean[5];
	}//empty argument constructor
	
	public Brain(boolean[] covid, boolean[] flu, boolean[] commonCold, boolean[] strepThroat) {
		super(covid, flu, commonCold, strepThroat);
		this.fever = false;
		this.fatiuge = false;
		this.smell = false;
		this.congestion = false;
		this.soreThroat = false;
	}//preferred constructor 
	
	
	//getSymptoms asks user to respond Yes or No to prompted symptom asked then sets the symptoms array.
	public void grabSymptoms() {
		/*System.out.println("Do you have a fever?");
		input = scan.nextLine();
		if(input.equals("Yes")){
			this.fever = true;
			symptoms[0] = this.fever;
		}
		else {
			this.fever = false;
			symptoms[0] = this.fever;
		}
		System.out.println("Are you feeling fatigue?");
		input = scan.nextLine();
		if(input.equals("Yes") || input.equals("yes")) {
			this.fatiuge = true;
			symptoms[1]= this.fatiuge;
		}
		else {
			this.fatiuge = false;
			symptoms[1] = this.fatiuge;
		}
		System.out.println("Have you lost your taste or smell?");
		input = scan.nextLine();
		if(input.equals("Yes")) {
			this.smell = true;
			symptoms[2]= this.smell;
		}
		else {
			this.smell = false;
			symptoms[2] = this.smell;
		}
		System.out.println("Do you feel congested?");
		input = scan.nextLine();
		if(input.equals("Yes")) {
			this.congestion = true;
			symptoms[3] = this.congestion;
		}
		else {
			this.congestion = false;
			symptoms[3] = this.congestion;
		}
		System.out.println("Do you have a sore throat?");
		input = scan.nextLine();
		if(input.equals("Yes")) {
			this.soreThroat = true;
			symptoms[4] = this.soreThroat;
		}
		else {
			this.soreThroat = false;
			symptoms[4] = this.soreThroat;
		}
		*/
		
	}//end getSymptoms
	
	//assessSymptoms compares each symptom in the symptoms array to each of the diseases arrays
	public void assessSymptoms() {
		for(int i = 0; i < 5; i++) {
		if(symptoms[0] == covid[0]) {
			if(symptoms[1] == covid[1]) {
				if(symptoms[2] == covid[2]) {
					if(symptoms[3] == covid[3]) {
						if(symptoms[4] == covid[4]) {
							symptoms = covid;
						}
					}
				}
			}
		}//compares to Covid array
		if(symptoms[0] == flu[0]) {
			if(symptoms[1] == flu[1]) {
				if(symptoms[2] == flu[2]) {
					if(symptoms[3] == flu[3]) {
						if(symptoms[4] == flu[4]) {
							symptoms = flu;
						}
					}
				}
			}
		}//compares to Flu array
		if(symptoms[0] == strepThroat[0]) {
			if(symptoms[1] == strepThroat[1]) {
				if(symptoms[2] == strepThroat[2]) {
					if(symptoms[3]== strepThroat[3]) {
						if(symptoms[4] == strepThroat[4]) {
							symptoms = strepThroat;
						}
					}
				}
			}
		}//compares to Strep Throat array
		if(symptoms[0] == commonCold[0]) {
			if(symptoms[1] == commonCold[1]) {
				if(symptoms[2] == commonCold[2]) {
					if(symptoms[3] == commonCold[3]) {
						if(symptoms[4] == commonCold[4]) {
							symptoms = commonCold;
						}
					}
				}
			}
		}//compares to common cold array
		}//end for loop
	}//end assessSymptoms method

	
	//returns results of comparison.
	public void returnResults() {
		if(symptoms == covid) {
			System.out.println("Your symptoms are consistant with COVID, you should go get tested and stay away from others.");
		}
		else if(symptoms == flu) {
			System.out.println("Your symptoms are consistant with the flu. You should drink lots of fluids and see a doctor.");
		}
		else if(symptoms == strepThroat) {
			System.out.println("Your symptoms are consistant with strep throat. You should go see a doctor and stop sharing drinks with others.");
		}
		else if(symptoms == commonCold) {
			System.out.println("It sounds like you just have a cold. Rest up and if you still feel bad, go see a doctor.");
		}
		else if(symptoms != flu || symptoms != covid || symptoms != strepThroat || symptoms != commonCold){
			System.out.println("It sounds like you are just having allergy troubles right now. If symptoms presist, check back in tomorrow.");
		}
		
	}//end return results
	
//Getters and Setters
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public boolean isFever() {
		return fever;
	}
	public void setFever(boolean fever) {
		this.fever = fever;
	}
	public boolean isFatiuge() {
		return fatiuge;
	}
	public void setFatiuge(boolean fatiuge) {
		this.fatiuge = fatiuge;
	}
	public boolean isSmell() {
		return smell;
	}
	public void setSmell(boolean smell) {
		this.smell = smell;
	}
	public boolean isCongestion() {
		return congestion;
	}
	public void setCongestion(boolean congestion) {
		this.congestion = congestion;
	}
	public boolean isSoreThroat() {
		return soreThroat;
	}
	public void setSoreThroat(boolean soreThroat) {
		this.soreThroat = soreThroat;
	}
	public void setSymptoms(boolean[] symptoms) {
		this.symptoms = symptoms;
	}	
	public boolean[] getSymptoms() {
		return symptoms;
	}
		
}	//end class