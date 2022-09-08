package check;
import constants.Constants;

public class Main {
	
	private String firstName = "Moriya";
	private String lastName = "Yuta";
	
	private static String printName(String firstName, String lastName) {
		
		return "pritnNameメソッド ⇨ " + firstName + lastName;
	}
	
	
	public static void main(String[] args) {
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		
		//System.out.println(printName("七海", "真弥"));
		//ここに変数を使用しましょう
		String a = "七海";
		String b = "真弥";
		System.out.println(printName(a, b));
		pet.introduce();
		robotpet.introduce();
		
	}
}
