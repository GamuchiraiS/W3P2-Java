import java.util.*;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		//takes in user input 
		String str = scanner.nextLine();
		
		Str s = new Str();
		s.get_String(str); //call method
		System.out.println("Original string: " + str);
		s.print_Upper(str); //call method
		System.out.println("In upper case: " + s.strUpper);
		s.print_Lower(str); //call method
		System.out.println("In lower case: " + s.strLower);
		scanner.close(); //closes Scanner

	}

}
