package check;
import constants.Constants;

public class Main {
	
	private String firstName = "Moriya";
	private String lastName = "Yuta";
	
	private String printName(String firstName, String lastName) {
		
		return String printNameBox = "pritnNameメソッド ⇨ " + firstName + lastName;
	}
	
	public static void main(String[] args) {
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		printName("七海", "真弥");
		
		System.out.println(printNameBox);
		pet.introduce();
		robotpet.introduce();
		
	}
}
