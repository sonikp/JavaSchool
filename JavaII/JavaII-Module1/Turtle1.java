/**
 * Turtle1.java is file for completing the problems in
 * text book
 * @author notroot
 *
 */

import java.util.*;
import java.awt.*;

public class Turtle1 extends SimpleTurtle
{
	  ////////////////// constructors ///////////////////////
	  
	  /** Constructor that takes the x and y and a picture to
	   * draw on
	   * @param x the starting x position
	   * @param y the starting y position
	   * @param picture the picture to draw on
	   */
	  public Turtle1 (int x, int y, Picture picture) 
	  {
	    // let the parent constructor handle it
	    super(x,y,picture);
	  }
	  
	  /** Constructor that takes the x and y and a model
	   * display to draw it on
	   * @param x the starting x position
	   * @param y the starting y position
	   * @param modelDisplayer the thing that displays the model
	   */
	  public Turtle1 (int x, int y, 
	                 ModelDisplay modelDisplayer) 
	  {
	    // let the parent constructor handle it
	    super(x,y,modelDisplayer);
	  }
	  
	  /** Constructor that takes the model display
	   * @param modelDisplay the thing that displays the model
	   */
	  public Turtle1 (ModelDisplay modelDisplay) 
	  {
	    // let the parent constructor handle it
	    super(modelDisplay);
	  }
	  
	  /**
	   * Constructor that takes a picture to draw on
	   * @param p the picture to draw on
	   */
	  public Turtle1 (Picture p)
	  {
	    // let the parent constructor handle it
	    super(p);
	  }  
	  
	  ////////////METHODS//////////////////////
	  
	  public void drawSquare()
	  {
		  this.turnLeft();
		  this.forward(40);
		  this.turnLeft();
		  this.forward(40);
		  this.turnLeft();
		  this.forward(40);
		  this.turnLeft();
		  this.forward(40);
	  }
	
	public static void main(String[] args)
	{
		World worldObj = new World();
		System.out.println(worldObj);
		
		// uses other Turtle class
		Turtle turtle = new Turtle(worldObj);
		System.out.println(turtle);

		turtle.forward(20);
		turtle.turnRight();
		turtle.forward(200);
		turtle.turn(-45);
		turtle.forward(100);
		
//		// Uses local Turtle1 class
		Turtle1 turtle1 = new Turtle1(worldObj);
		System.out.println(turtle1);
		
//		turtle1.turnRight();
//		turtle1.forward(200);
//		turtle1.turn(-45);
//		turtle1.forward(100);
//		turtle1.drawSquare();
		

	}

}