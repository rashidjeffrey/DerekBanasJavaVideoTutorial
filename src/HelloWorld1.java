
public class HelloWorld1 {
	
	static String randomString = "String to print";
	
	static final double PINUM = 3.14;

	public static void main(String[] args) {
		System.out.println(randomString);
		System.out.println(PINUM);
		
		int integerOne = 0;
		int integerTwo = integerOne + 1;
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 920000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.12222222222222222;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		System.out.println(randomChar);
		
		String randomString = "xxxxxxx";
		String anotherString = "zzzzzz";
		String andAnotherString = randomString + ' ' + anotherString;
		System.out.println(andAnotherString);
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigByte);
		String longString = Long.toString(bigByte);
		String floatString = Float.toString(bigByte);
		String doubleString = Double.toString(bigByte);
		//String booleanString = Boolean.toString(bigByte);
		
		double aDoubleValue = 3.1444444444444444444;
		int doubleToInt = (int) aDoubleValue;
		System.out.println(doubleToInt);
		
		int stringToInt = Integer.parseInt(intString);
		System.out.println(stringToInt);
		
		
		
		
		
	}

}
