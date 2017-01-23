public class Student extends Object

/**
 * Class describes a student. A student has a name and a 
 * array of grades. You can get information about the student
 * such as his/her name and grade average, & change grades
 */

{
	////////////////////fields///////////////
	private String name;
	private double[] gradeArray;
	
	
	
	////////////////////constructor///////////////
	public Student()
	{
		// default empty constructor
	}
	
	public Student(String theName)
	{
		this.name = theName;
	}
	
	public Student(String theName, double[] theGradeArray)
	{
		this.name = theName;
		this.gradeArray = theGradeArray;
	}
	
	
	////////////////////methods///////////////
	//////getters//////////
	
	/**
	 * Method to get name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Method to get specific grade
	 * @param index the index to get the grade
	 * @return grade
	 */
	public double getGrade(int index)
	{
		return this.gradeArray[index];
	}
	
	/**
	 * Method to calculate and get average
	 * @return average
	 */
	public double getAverage()
	{
		double average = 0.0;
		
		if (this.gradeArray != null && this.gradeArray.length > 0)
		{
			double sum = 0.0;
			for (int i = 0; i < this.gradeArray.length; i++)
			{
				sum = sum + this.gradeArray[i];
			}
			average = sum / this.gradeArray.length;
		}
		return average;
	}
	
	//////setters//////////
	/**
	 * Method to set specific grade
	 * @param index select specific grade location
	 * @return set new grade
	 */
	public boolean setGrade(int index, double newGrade)
	{
		if (newGrade < 0 || this.gradeArray == null)
		{
			return false;
		}
		else
		{
			this.gradeArray[index] = newGrade;
			return true;
		}
	}
	
	
	public String toString()
	{
		return "Student object named: " + this.name + 
				"\t\tAverage: " + this.getAverage();
	}

}