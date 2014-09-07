
public class ValidarRomanos {

public static  boolean validarsimbolo(String numero){
		
		for (int i = 0; i < numero.length(); i++) {
			char n = numero.charAt(i);
			switch (n) {
			case 'I':
				
				return true;
			case 'V':
				return true;
				
			case 'X':
				return true;
				
			case 'L':
	
				return true;
			case 'C':
	
				return true;
			case 'D':
				return true;
			case 'M':
				return true;
				
			default:
				return false;
			}
		}
		return false;
	}
	
	
}
