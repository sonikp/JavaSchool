public class DisplayImage
{
	public static void main(String[] args)
	{
		Image image1 = new Image("/Users/Shared/Java-Libraries/CourseCD/"
				+ "mediasources/","butterfly.jpg");
		Image image2 = new Image("/Users/Shared/Java-Libraries/CourseCD/"
				+ "mediasources/","butterfly1.jpg");
		Image image3 = new Image("/Users/Shared/Java-Libraries/CourseCD/"
				+ "mediasources/","butterfly2.jpg");
		
		Image[] imageArray = {image1,image2,image3};
				
	}
}