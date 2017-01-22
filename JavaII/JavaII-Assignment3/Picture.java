import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/*
 * Assignment 3, Michael Floerchinger
 * 
 * This is a fresh copy of Picture.java created specifically for Assignment3.
 * 
 * 
 */



/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
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
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  /*
   * Program 6: Increasing the Red component by 30%
   * 
   * Method to increase the amount of red by 30%
   */
  
  public void increaseRed()
  {
	  Pixel[] pixelArray = this.getPixels();
	  Pixel pixel = null;
	  int value = 0;
	  int index = 0;
	  
	  // loop through all pixels
	  while ( index < pixelArray.length)
	  {
		  // get the current pixel
		 pixel = pixelArray[index];
		 
		 // get the value
		 value = pixel.getRed();
		 
		 // change the value to 1.3 times what it was
		 value = (int)(value * 1.3);
		 
		 // set the pixel value to 1.3 times what it was
		 pixel.setRed(value);
		 
		 // increment counter by 1
		 index++;
	  }
  }
  
  /*
   * Increase Red: Overloaded method, increase by selected % amount.
   * 
   * Increasing the Red by a selected % amount.
   * Method to increase the amount of red by selected % amount.
   */
  
  public void increaseRed(double increaseFactor)
  {
	  Pixel[] pixelArray = this.getPixels();
	  Pixel pixel = null;
	  int value = 0;
	  int index = 0;
	  
	  // convert submitted percentage factor amount to a usable number for the increase
	  double increaseAmount = (increaseFactor / 100) + 1 ;	// conversion only works with +ve numbers
	  System.out.println(increaseAmount);
	  
	  // loop through all pixels
	  while ( index < pixelArray.length)
	  {
		  // get the current pixel
		 pixel = pixelArray[index];
		 
		 // get the value
		 value = pixel.getRed();
		 //System.out.print(value + " \t");

		 // change the value to a submitted factor, x times what it was
		 value = (int)(value * increaseAmount);
		 //System.out.print(value + " \n");
		 
		 // set the pixel value to 1.3 times what it was
		 pixel.setRed(value);
		 
		 // increment counter by 1
		 index++;
	  }
  }
  
  


  /*
   * Add an increase Green method, same as text book increase red, by 1.3
   * 
   * This time demonstrated with a for loop
   */
 
  
  public void increaseGreen()
 {
	  Pixel[] pixelArray = this.getPixels();
	  int value = 0;
	
	  // loop through the pixels
	  for ( int i = 0; i < pixelArray.length; i++)
	  {
		  // get the current pixel
		 value = pixelArray[i].getGreen();
		 
		 // set green 1.3 * what it was
		 pixelArray[i].setGreen((int)(value * 1.3));

	  }
 }
  
  /*
   * Increase Green: Overloaded method, increase by selected % amount.
   * 
   * Method to increase the amount of green by selected % amount.
   * This method allows for an increase of +ve or -ve % factor
   */
  
  
  public void increaseGreen(double increaseFactor)
  {
 	  Pixel[] pixelArray = this.getPixels();
 	  int value = 0;
	  
 	  // convert submitted percentage factor amount to a usable number for the increase
 	  double increaseAmount = (100 + increaseFactor) / 100;		// this conversion works with both +ve and -ve numbers
	  // System.out.println(increaseAmount);					// Debug statement, determine the calculation amount.
 	
 	  // loop through the pixels
 	  for ( int i = 0; i < pixelArray.length; i++)
 	  {
 		  // get the current pixel
 		 value = pixelArray[i].getGreen();
 		 
 		 // set green by whatever factor was submitted by user 
 		 pixelArray[i].setGreen((int)(value * increaseAmount));

 	  }
  }
  
  /*
   * Add an increase blue method.
   * 
   * Demonstrated with a for loop
   */
 
  
  public void increaseBlue()
 {
	  Pixel[] pixelArray = this.getPixels();
	  int value = 0;
	
	  // loop through the pixels
	  for ( int i = 0; i < pixelArray.length; i++)
	  {
		  // get the current pixel
		 value = pixelArray[i].getBlue();
		 
		 // set blue 1.3 * what it was
		 pixelArray[i].setBlue((int)(value * 1.3));

	  }
 }
  
  /*
   * Increase Blue: Overloaded method, increase by selected % amount.
   * 
   * Increasing the blue by a selected % amount.
   * This method accepts both a +ve or a -ve number
   */
  
  
  public void increaseBlue(double increaseFactor)
  {
 	  Pixel[] pixelArray = this.getPixels();
 	  int value = 0;
	  
 	  // convert submitted percentage factor amount to a usable number for the increase
 	  double increaseAmount = (100 + increaseFactor) / 100;		// this conversion works with both +ve and -ve numbers
	  System.out.println(increaseAmount);
 	
 	  // loop through the pixels
 	  for ( int i = 0; i < pixelArray.length; i++)
 	  {
 		  // get the current pixel
 		 value = pixelArray[i].getBlue();
 		 
 		 // set blue by whatever factor was submitted by user 
 		 pixelArray[i].setBlue((int)(value * increaseAmount));

 	  }
  }
  
  /*
   * Add a blur method
   * Method to blur pixels
   * @param numPixels the number of pixels to average in all directions
   * If the numPixel is 2 then we will average all pixels in the rectangle
   * defined by 2 before the current pixel to 2 after the current pixel
   * 
   * takes arguments x, y, width, and height arguments
   */
  
  public void blur(int x, int y, int blurWidth, int blurHeight)
  {
	  Pixel pixel = null;
	  Pixel samplePixel = null;
	  int redValue = 0;
	  int greenValue = 0;
	  int blueValue = 0;
	  int count = 0;
	  int numPixels = 10;			// blur intensity: number of pixels to average in all directions
	  
	  // dimensions of blur location, (x,y) start point of blur area, blurAreaWidth, and blurAreaHeight
	  int xAxis = x;
	  int yAxis = y;
	  int blurAreaWidth = blurWidth;
	  int blurAreaHeight = blurHeight;
	  
	  // error checking, notification only
	  if ( blurAreaWidth > this.getWidth() || blurAreaHeight > this.getHeight() )
	  {
		  System.out.println("\n\n ****The dimensions you selected "
		  		+ "are outside of the dimensions of the picture**** \n\n");
	  }
	  
	  // status counter
	  String status = ".";
	  System.out.print("Be patient: this takes a while! \nCalculating" + status);
	  int statusCount = 0;
	  
	  // loop through the columns of the pixels, between start = xAxis and blurAreaWidth
	  for ( int xColumnLocation = xAxis; xColumnLocation < blurAreaWidth; xColumnLocation++)	
	  {
		  //loop through the rows of the pixels, between start = yAsix and blurAreaHeight
		  for ( int yRowLocation = yAxis; yRowLocation < blurAreaHeight; yRowLocation++)	
		  {
			  // get the current pixel
			  pixel = this.getPixel(xColumnLocation, yRowLocation);
			  
			  // reset the count and red, green, blue values
			  count = 0;
			  redValue = greenValue = blueValue = 0;
			  
			  // loop through pixel numPixel before location xColumnLocation to numPixel after xColumnLocation
			  for ( int xSample = xColumnLocation - numPixels; xSample <= xColumnLocation + numPixels; xSample++)
			  {
				  // loop through pixel numPixel before location yRowLocation to numPixel after yRowLocation 
				  for ( int ySample = yRowLocation - numPixels; ySample <= yRowLocation + numPixels; ySample++)
				  {
					  // check if we are in range of acceptable pixels
					  if (xSample >= 0 && xSample < this.getWidth() && ySample >= 0 && ySample < this.getHeight())
					  {
						  samplePixel = this.getPixel(xSample, ySample);
						  redValue = redValue + samplePixel.getRed();
						  greenValue = greenValue + samplePixel.getGreen();
						  blueValue = blueValue + samplePixel.getBlue();
						  count = count + 1;
					  }
				  }
			  }
			  // status counter notification
			  statusCount++;
			  if (statusCount == 2000)
			  {
				  System.out.print(".");
				  statusCount = 0;
			  }
			  
			  // use average color of surrounding pixels
			  Color newColor = new Color(redValue / count, greenValue / count, blueValue / count);
			  pixel.setColor(newColor);
			  status = status + ".";
		  }
		  
	  }
	  System.out.println("\nDone: now completed");
  }
  
  /*
   * Add another method of your own devising, that does something interesting.
   * 
   * Method mirrors 3x clock faces.
   * Aim to have them run through the filters
   */
  
  public void mirrorClockface()
  {
	  // Clockface dimensions : 169,58 to 241,126
	  int top = 58;		// y-Axis
	  int bottom = 126;	// y-Axis  
	  int left = 169;	//x-Axis
	  int right = 241;	//x-Axis
	  int height = (bottom - top) * 2 + 118; // bottom - top; // 126-58 = 68 + offset = 118
	  System.out.println(height);
	  
	  Pixel topPixel = null;
	  Pixel bottomPixel1 = null;
	  Pixel bottomPixel2 = null;
	  Pixel bottomPixel3 = null;
	  
	  // loop through columns
	  for ( int x = left; x < right; x++) //
	  {
		  // loop through rows
		  for ( int y = top; y < bottom; y++) // 
		  {
			  // copy pixels to 
			  topPixel = getPixel(x,y); 
			  
			  // clock-left
			  bottomPixel1 = getPixel((x - 72), height - 1 - y); 	// move 72 positions left
			  bottomPixel1.setColor(topPixel.getColor());
			  
			  /*
			   * wanted to create 3 new picture object3 for the clock face3, then run in through the 
			   * filters that were created for this project
			   * increaseRed()
			   * increaseGreen()
			   * increaseBlue
			   */
			  // color face red
			  //Picture clock1 = new Picture();
			  //clock1.increaseRed();
			  			  	  
			  // clock-mid
			  bottomPixel2 = getPixel(x, height - 1 - y); 
			  bottomPixel2.setColor(topPixel.getColor());
			  
			  // color face green
			  //Picture clock2 = new Picture();
			  //clock2.increaseGreen();
			  			  
			  // clock-right
			  bottomPixel3 = getPixel(x + 72, height - 1 - y); 		// move 72 positions right
			  bottomPixel3.setColor(topPixel.getColor());
			  
			  // color face blue
			  //Picture clock3 = new Picture();
			  //clock3.increaseGreen();

		  }
	  }
  }
  
  
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
 
  public static void main(String[] args) 
  {

     
	  // clock-tower.jpg represents the red color changes pretty well
	  String fileName = FileChooser.getMediaPath("clock-tower.jpg");
	  Picture sourcePicture = new Picture(fileName);
	  System.out.println(sourcePicture);
	  sourcePicture.explore();				// show's original picture
	  
	  
	  // task 1: increase red
	  sourcePicture.increaseRed();			// original text book method to increase by 30%
	  sourcePicture.increaseRed(30);		// task 2: enhanced method to allow use to submit an increased amount.
	  sourcePicture.explore();
	  
	  
	  /*
	  // task 3: increase green
	  sourcePicture.increaseGreen();
	  sourcePicture.increaseGreen(-70);		// task 4: change factor allows for +ve or -ve numbers
	  sourcePicture.explore();
      */
	  
	  /*
	  // task 5: increase blue
	  sourcePicture.increaseBlue();
	  sourcePicture.increaseBlue(83);		// task 6: change factor allows for +ve or -ve numbers
	  sourcePicture.explore();
	  */
	  
	  /*
	  // task 7: implement blurring over a defined area (clock face)  "needs x, y, width, and height arguments"
	  //sourcePicture.blur(165, 54, 240, 140);				// clock face only
	  sourcePicture.blur(100, 50, 300, 200);				// for massive blurring.... + status indicator
	  sourcePicture.explore();								
	  */
	  
	  /*
	  // task 8: do something interesting
	  sourcePicture.mirrorClockface();
	  sourcePicture.explore();
	  */
  }
  
} // this } is the end of class Picture, put all new methods before this
 