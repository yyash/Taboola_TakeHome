public class StringToCheckNumber {	
	public static Boolean CheckNumber(String sentence) {
		String str = sentence;
		
		for (int i = 0; i < str.length()-1; i++) {
			if (Character.isDigit(str.charAt(i)) {
				return true;
			}
		}
		return false;

	}

	public static void main (String args[]) {
		String  stringToCheck="123";
		System.out.println("String :  "+ stringToCheck);
		Boolean output= CheckNumber( stringToCheck );
		if(output) {
			System.out.println("There is a number in the senetence");
		}
		else {
			System.out.println("There is no number in the sentence");
		}
	}
}