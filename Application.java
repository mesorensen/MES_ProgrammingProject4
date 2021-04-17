//Application class for project
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Hi! I heard you aren't feeling well. Let me try to help. ");
		//new conversation
		
		
		//conversation.grabSymptoms();
		
	
		Conversation chat = new Conversation();
		chat.getConversation();
		
		Brain conversation = new Brain();
		conversation.assessSymptoms();
	//	conversation.returnResults();
		System.out.println("Hopefully I was able to help. Remember, I am not a medical professional so if you think you are ill, consult your doctor immediately.");

	}

}//end class
