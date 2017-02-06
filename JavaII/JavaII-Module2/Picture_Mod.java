import java.awt.Color;
import java.awt.image.BufferedImage;

public class Picture_Mod extends SimplePicture
{
	///////////fields///////////
	String fileName;
	
	
	/////////////Constructors//////////////
	
	  /**
	   * Constructor that takes no arguments 
	   */
	  public Picture_Mod()
	  {
	    /* not needed but use it to show students the implicit call to super()
	     * child constructors always call a parent constructor 
	     */
	    super();  
	  }
	  
	  /**
	   * Constructor that takes a file name and creates the picture 
	   * @param fileName the name of the file to create the picture from
	   */
	  public Picture_Mod(String fileName)
	  {
	    // let the parent class handle this fileName
	    super(fileName);
	  }
	  
	  /**
	   * Constructor that takes the width and height
	   * @param width the width of the desired picture
	   * @param height the height of the desired picture
	   */
	  public Picture_Mod(int width, int height)
	  {
	    // let the parent class handle this width and height
	    super(width,height);
	  }
	  
	  /**
	   * Constructor that takes a picture and creates a 
	   * copy of that picture
	   */
	  public Picture_Mod(Picture copyPicture)
	  {
	    // let the parent class do the copy
	    super(copyPicture);
	  }
	  
	  /**
	   * Constructor that takes a buffered image
	   * @param image the buffered image to use
	   */
	  public Picture_Mod(BufferedImage image)
	  {
	    super(image);
	  }
	 
	  ////////////////methods////////////////
	  
	  /**
	   * reduce red by 10% and 20%
	   */
	  public void decreaseRed(double amount)
	  {
		  Pixel[] pixelArray = this.getPixels();
		  Pixel pixel = null;
		  int value = 0;
		  int index = 0;
		  double reduction = ((100 - amount) / 100);
		  System.out.println("reduction = " + reduction);
		  
		  while(index < pixelArray.length)
		  {
			  pixel = pixelArray[index];
			  value = pixel.getRed();
			  value = (int)(value * reduction);
			  pixel.setRed(value);
			  index++;
		  }
	  }
	  
	  
	  /**
	   * increase red by 1.3
	   */
	  public void increaseRed()
	  {
		  
		  Pixel[] pixelArray = this.getPixels();
		  Pixel pixel = null;
		  Color color = null;
		  int value = 0;
		  int index = 0;
		  double red,green,blue,newRed = 0;
		  
		  for ( int i = 0; i < pixelArray.length; i++)
		  {
			  pixel = pixelArray[i];
			  
			  //get color values
			  red = pixel.getRed();
			  green = pixel.getGreen();
			  blue = pixel.getBlue();
			  
			  // change red
			  newRed = (double)(red * 1.3);
			  
			  // set color
			  pixel.setColor(new Color(newRed,green,blue));
		  }
		  
		  
	  }
	
	
	
	public static void main(String[] args)
	{

		String filename = FileChooser.getMediaPath("butterfly1.jpg");
		Picture_Mod file = new Picture_Mod(filename);
		System.out.println(filename);
		file.explore();
		file.decreaseRed(10);
		file.explore();

	}
}