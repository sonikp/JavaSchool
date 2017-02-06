import java.util.ArrayList;

public class TestFile1
{
	public static void main(String[] args)
	{
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("Item1");
		wordList.add("Item2");
		wordList.add("Item3");
		wordList.add("Item4");
		
		System.out.println("Wordlist is " + wordList);
		
		wordList.add(2, "element");
		
		System.out.println("New wordList is " + wordList);
		
		for (String value : wordList) 
		{
            System.out.println(value);
            System.out.println("\n\n");
        }
		
		
		for (int i = 0; i < wordList.size(); i++) 
		{
			
			System.out.println("Index: " + i + " - Item: " + wordList.get(i));
		}
		
		
		
		
		/*
		int[] temperature = {12, 8, 6, 7, 8, 9, 10} ;
		System.out.println(temperature[0]);
		
		for ( int i = 0; i < temperature.length; i++)
		{
			System.out.print(i + "\t");
			int currentTemp = temperature[i];
			System.out.println(currentTemp);
		}
		*/
	}

}