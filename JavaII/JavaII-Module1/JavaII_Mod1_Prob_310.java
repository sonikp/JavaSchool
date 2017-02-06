public class JavaII_Mod1_Prob_310
{
	public static void main(String[] args)
	{
		System.out.println("test-JavaII_Mod1_Prob_310");
		
		String filename = FileChooser.getMediaPath("butterfly.jpg");
		Picture image = new Picture(filename);
		image.show();
		

		
		
	}
}