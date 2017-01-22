public class Example01
{
	public static void main(String[] args)
	{
		
		// Data types and casting
		System.out.println(42/5);
		System.out.println(42.0/5.0);
		System.out.println((double)42/5);	// double = 42, int = 5 the narrower data type will be cast to a wider data type
		
		// Relation operators
		System.out.println(42 > 8);
		System.out.println(42 < 8);
		
		// calling methods
		// doesnt actually work for some reason.
		//System.out.println(Character.getNumericValue('Z');
		
		// Object Methods; 
		String message = "Strings are true Objects!";
		String lowerMessage = message.toLowerCase();
		System.out.println(message);
		System.out.println(lowerMessage);
		
	}
}