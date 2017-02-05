/**
 * Problem 11.6
 * Create a class CartoonPanel and create a constructor that takes an array
 * of Picture objects and displays them from left to right like in a 
 * newspaper. Use the scale method to scale the pictures to fit. 
 * Create a new picture to use to display the cartoon on.
 * 
 * @author notroot
 *
 */

public class CartoonPanel extends Picture
{
	///////////////fields////////////////////////

	
	///////////////constructors////////////////////////
	/**
	 * Constructor that takes no arguments
	 * 
	 * @param args
	 */
	public CartoonPanel()
	{
		super();
	}
	/**
	 * Constructor that takes filename argument
	 * 
	 * @param args
	 */
	public CartoonPanel(String filename)
	{
		super(filename);
	}
	
	public static void main(String[] args)
	{
		String filename1 = FileChooser.getMediaPath("butterfly1.jpg");
		Picture panelImage1 = new Picture(filename1);
		System.out.println(filename1);
		panelImage1.explore();
		
		String filename2 = FileChooser.getMediaPath("butterfly2.jpg");
		Picture panelImage2 = new Picture(filename2);
		System.out.println(filename2);
		panelImage2.explore();
		
	}
	
}