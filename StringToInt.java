public class StringToInt {	
	public static int myStringToInteger(String str) {
		int num = 0, multi = 1;
		for (int i = str.length()-1; i >= 0; i--) {
			num += (str.charAt(i) - '0') * multi;
			multi *= 10;
		}
		return num;
	}

	public static void main (String args[]) {
			String  convertingString="123";
			System.out.println("String Before Conversion :  "+ convertingString);
			int output= myStringToInteger( convertingString );
			System.out.println();
			System.out.println();
			System.out.println("int value as output "+ output);
			System.out.println();
	}
}