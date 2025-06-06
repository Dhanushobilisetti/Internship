import java.util.*;
class Student
{
	int rno;
	String name;
	float cgpa;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter rno: ");
		rno=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter cgpa: ");
		cgpa=sc.nextFloat();
	}
		void disp()
		{
			this.read();
			System.out.println("rno: "+rno);
			System.out.println("name: "+name);
			System.out.println("cgpa: "+cgpa);
		}
}
class Main
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.disp();
	}
}