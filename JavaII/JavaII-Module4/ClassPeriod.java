/**
 * ClassPeriod represents a class period which has a teacher, a 
 * period number, and an array of students
 */
public class ClassPeriod
{
	////////////////////fields///////////////
	private String teacherName;
	private int periodNumber;
	private Student[] studentArray = new Student[35];
	
	////////////////////constructors///////////////
	public ClassPeriod()
	{
		// default empty constructor
	}
	
	/**
	 * Constructor that takes just the teachers name
	 * @param name the name for the teacher
	 */
	public ClassPeriod(String name)
	{
		this.teacherName = name;
	}
	
	/**
	 * Constructor that takes the teachers name and period number
	 * @param name the name for the teacher
	 */
	public ClassPeriod(String name, int num)
	{
		this.teacherName = name;
		this.periodNumber =  num;
	}
	
	////////////////////methods///////////////
	
	/**
	 * Method to get the teacher's name
	 * @return name of teacher, or null if none yet
	 */
	public String getTeacherName()
	{
		return teacherName;
	}
	
	/**
	 * Method to get period number
	 * @return number of this period
	 */
	public int getPeriodNumber()
	{
		return periodNumber;
	}
	
	/**
	 * Method to get student based on index
	 * @return name of student, or null if none yet
	 */
	public Student getStudentName(int index)
	{
		return studentArray[index];
	}
	
	/**
	 * Method to set the teacher's name
	 * @param name the name to use
	 */
	public void setTeacherName(String name)
	{
		this.teacherName = name;
	}
	
	/**
	 * Method to set the period number, if it hasn't been set
	 * @param num the number to use
	 * @param flag to say if set worked
	 */
	public boolean setPeriodNumber(int num)
	{
		if (this.periodNumber == 0)
		{
			this.periodNumber = num;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Method to set the student at index
	 * @param studentObj the student object to user
	 * @param index the index to set the student at
	 */
	public void setStudent(Student studentObj, int index)
	{
		this.studentArray[index] = studentObj;
	}
	
	public String toString()
	{
		return "Teacher object named: " + this.teacherName + 
				"\t\tfor period: " + this.periodNumber +
				"\t\thas student: " + this.studentArray;
	}

	
	
	
	
	
}
