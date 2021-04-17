///Conversation class asks user for an input of their symptoms and parses through the input. Then it sets the symptoms array. 
import java.util.*;

public class Conversation {

	Scanner scan = new Scanner(System.in);
	String response;
	String[] fever = {"Fever", "Temperature", "Temp", "fever", "temperature", "temp"};
	String[] fatiuge = {"fatiuge", "Fatiuge", "Tired", "tired", "Exhausted", "exhausted"};
	String[] lostTasteSmell = {"Taste", "taste", "Smell", "smell"};
	String[] congestion = {"Congested", "congested", "Stuffy", "stuffy", "Runny nose", "runny nose", "cough"};
	String[] soreThroat = {"Sore throat", "sore throat", "itchy"};
	Brain brain;

	public Conversation() {
		brain = new Brain();
	}//empty argument constructor
	
	public void getConversation() {
		System.out.println("What symptoms are you having?");
		response = scan.nextLine();
		
		for(int i = 0; i < 6; i++) {
			if(response.contains(fever[i])) {
				brain.symptoms[0] = true;
			}
		}
		for(int i = 0; i < 6; i++) {
			if(response.contains(fatiuge[i])) {
				brain.symptoms[1] = true;
			}
		}
		for(int i = 0; i < 4; i++) {
			if(response.contains(lostTasteSmell[i])) {
				brain.symptoms[2] = true;
			}
		}	
		for(int i = 0; i < 7; i++) {
			if(response.contains(congestion[i])) {
				brain.symptoms[3] = true;
			}
		}

		for(int i = 0; i < 3; i++) {
			if(response.contains(soreThroat[i])) {
				brain.symptoms[4] = true;
			}
		}
		brain.assessSymptoms();
		brain.returnResults();
	}
}
