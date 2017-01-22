/* Turtle.java Assignment week 1
 * 
 * Michael Floerchinger
 * 
 */


import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
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
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  
  
  /*
   * ******************************************************
   * Michael Floerchinger
   * 
   * Additional Methods created here
   * ******************************************************
   */

  public void drawSquare()
  {
	  this.turnRight();
	  this.forward(30);
	  this.turnRight();
	  this.forward(30);
	  this.turnRight();
	  this.forward(30);
	  this.turnRight();
	  this.forward(30);
  }
  
  public void drawParameterizedRectangle(int width, int height)
  {
	  
	  this.turnRight();
	  this.forward(width);
	  this.turnRight();
	  this.forward(height);
	  this.turnRight();
	  this.forward(width);
	  this.turnRight();
	  this.forward(height);
  }
  
  public void drawSquareRightParam(int length)
  {
	  
	  this.setPenColor(Color.magenta);
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
	  this.forward(length);
	  this.turnRight();
  }
  
  public void drawRectangleLeftParam(int length)
  {
	  
	  this.turnLeft();
	  this.forward(length);
	  this.turnLeft();
	  this.forward(length * 2);
	  this.turnLeft();
	  this.forward(length);
	  this.turnLeft();
	  this.forward(length * 2);
  }
  
 public void drawHexagonRight(int length)
 {
	 
	 this.setPenColor(Color.blue);
	 this.forward(length);
	 this.turn(60);
	 this.forward(length);
	 this.turn(60);
	 this.forward(length);
	 this.turn(60);
	 this.forward(length);
	 this.turn(60);	 
	 this.forward(length);
	 this.turn(60);
	 this.forward(length);
	 this.turn(60);
	 
	 
 }
 
 public void drawPentagonRight(int length)
 {
	 
	 this.setPenColor(Color.orange);
	 this.forward(length);
	 this.turn(72);
	 this.forward(length);
	 this.turn(72);
	 this.forward(length);
	 this.turn(72);
	 this.forward(length);
	 this.turn(72);
	 this.forward(length);
	 this.turn(72);
	 
	 
 }
 
 public void drawCrazySpiral()
 {
	  for (int j = 1; j <= 230; j+=1) 
	  {
		  this.setPenColor(Color.green);
		  this.moveTo(320,240);		  
		  this.turn(5); 
		  this.forward(j);
	  }
	  
	  this.turnRight();
 }
  
 public void drawCircle()
 {
	 // relocating position
	 this.penUp();
	 this.forward(200);
	 this.setPenColor(Color.red);
	 this.penDown();
	 this.turnRight();
	  	  
	  // draw circle
	  for (int i = 1; i <= 360; i+=10 )
	  {
		  this.forward(38);
		  this.turn(10);
		  
	  }
 }
 
 
 
  public static void main(String[] args)
  {
    
	  // Assignment - need methods for drawRectangle, drawHexagon, drawPentagon, something interesting
	  // The mating rituals of the Javian Mathematical Turtle
	
	  // Create world objects and turtle objects
	  World duckPond = new World();
	  Turtle bertyDaTurtle = new Turtle(duckPond);
	  Turtle berthaDaOtherTurtle = new Turtle(duckPond);
	  
	  // Setup turtle information
	  duckPond.setName("DuckPond");
	  bertyDaTurtle.setName("Berty");
	  berthaDaOtherTurtle.setName("Bertha");
	  
	  // Berty, marking territorial boundaries
	  bertyDaTurtle.drawCircle();
	  
	  // Mating ritual of Bertha; strutting her stuff
	  berthaDaOtherTurtle.penUp();
	  berthaDaOtherTurtle.moveTo(250,110);
	  berthaDaOtherTurtle.penDown();
	  berthaDaOtherTurtle.turn(90);
	  berthaDaOtherTurtle.drawHexagonRight(150);
	  berthaDaOtherTurtle.drawPentagonRight(150);
	  berthaDaOtherTurtle.drawSquareRightParam(150);

	  
	  // Berty, going a little crazy in the pond
	  bertyDaTurtle.drawCrazySpiral();
	  bertyDaTurtle.setPenColor(Color.black);
	  bertyDaTurtle.turn(-70);
	  bertyDaTurtle.drawRectangleLeftParam(173);
	  bertyDaTurtle.turn(156);
	  bertyDaTurtle.forward(440);
	  bertyDaTurtle.turn(-66);
	  bertyDaTurtle.setPenColor(Color.blue);
	  bertyDaTurtle.forward(110);
	  bertyDaTurtle.drawSquare();
	  bertyDaTurtle.turn(180);
	  bertyDaTurtle.forward(90);
	  
	  // Bertha realizes Berty is a complete loon, and she's into that sort of thing!!!
	  berthaDaOtherTurtle.turn(241);
	  berthaDaOtherTurtle.forward(40);
	  
	  // ahhhh, g'day mate, what are you doing here?
	  // (DebugCode: find out location)
	  System.out.println(bertyDaTurtle);
	  System.out.println(berthaDaOtherTurtle);
	  
	  // (DebugCode: re-adjust location)
	  bertyDaTurtle.turn(-90);
	  berthaDaOtherTurtle.moveTo(220, 55);
	  berthaDaOtherTurtle.turn(-331);
	  
	  // (DebugCode: check location)
	  System.out.println(bertyDaTurtle);
	  System.out.println(berthaDaOtherTurtle);
	  
	  // Bliss: synchronized swimming
	  bertyDaTurtle.setPenColor(Color.black);
	  berthaDaOtherTurtle.setPenColor(Color.orange);
	  bertyDaTurtle.drawParameterizedRectangle(300,440);
	  berthaDaOtherTurtle.drawParameterizedRectangle(300,440);
	  

  }

} // this } is the end of class Turtle, put all new methods before this