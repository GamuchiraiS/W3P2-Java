
public class Str {
	public String str;
	public String strUpper;
	public String strLower;
	
	//constructor
	public Str(){
	}

	//method for getting user input 
	public String get_String(String str){
		return str; //returns the string from the user
	}

	//method for turning string to uppercase
	public String print_Upper(String str){
		strUpper = str.toUpperCase();
		return strUpper; //returns the string in uppercase
	}

	//method for turning string to lowercase
	public String print_Lower(String str){
		strLower = str.toLowerCase();
		return strLower; //returns the string in lowercase
	}

}
