public class School
{
	public static void main(String[] args)
	{
		// no argument constructor
		System.out.println(new Student());
		System.out.println(new ClassPeriod());
		System.out.println();
		
		// uses single constructor
		System.out.println(new Student("Amy Clark"));
		System.out.println(new ClassPeriod("Bob", 3));
		//System.out.println("\n\n");
		
		// get class
		System.out.println("\n--get class--");
		Student student1 = new Student("Amy Clark");
		ClassPeriod teacher1 = new ClassPeriod("Mr. Angry", 3);
		Class studentClass = student1.getClass();
		System.out.println("studentClass: " + studentClass);
		Class teacherClass = teacher1.getClass();
		System.out.println("teacherClass: " + teacherClass);

		// get superclass
		Class parentClass = studentClass.getSuperclass();
		System.out.println(parentClass);
		System.out.println();
		
		// declare variables
		double[] gArray = {80,90,95,87,98};
		Student s1 = new Student("Amy Clark", gArray);
		Student s2 = s1;
		
		
		double[] gArray2 = new double[5];
		gArray2[0] = 92;
		gArray2[1] = 94;
		gArray2[2] = 97;
		gArray2[3] = 91;
		gArray2[4] = 93;
		
		System.out.println(new Student("Ron Smith", gArray2));
		System.out.println(s2 + " has teacher: \n" + teacher1);
		
		//System.out.println(student1.name); //displays error of accessing a private method
		
		double[] gArray3 = {55,85,73,92,81};
		Student student2 = new Student("Bill Simpson", gArray3);
		System.out.print("\nname: " + student2.getName());
		System.out.print("\n");
		System.out.print("average grade: " + student2.getAverage());
		System.out.print("\n");
		System.out.print("first grade: " + student2.getGrade(0));
		System.out.print("\n");
		double getGrade = student2.getGrade(0);
		System.out.println("change grade from: " + getGrade);
		boolean setNewGrade = student2.setGrade(0, 56);
		getGrade = student2.getGrade(0);
		System.out.println("did it work: \"" + setNewGrade + "\"?, to change grade to: " + getGrade);
		System.out.println("get new average: " + student2.getAverage());
		
		ClassPeriod teacherName = new ClassPeriod("bob", 3);
		System.out.println("Your teacher is: " + teacherName);
		
		
		
	}
}