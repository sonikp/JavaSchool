/**
 * http://stackoverflow.com/questions/10263861/importing-an-image-file-adding-it-to-an-arraylist-and-then-displaying-the-imag
 * http://stackoverflow.com/questions/17219129/how-to-use-jfilechooser-to-display-image-in-a-jpanel
 * 
 * 
 * @author notroot
 *
 */

public class Image
{
	///// fields //////
	private String fileLocation;
	private String name;
	
	////// constuctors ///////
	public Image()
	{
		// empty constructor
	}
	
	//////// methods ///////
	
	public String getFileLocation()
	{
		return fileLocation;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setFileLocation(String newFileLocation)
	{
		this.fileLocation = newFileLocation;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public Image(String newFileLocation, String newName)
	{
		setFileLocation(newFileLocation);
		setName(newName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}