class Student
{
	int rno;
	String name;
	float cgpa;
	Student(int rno,String name,float cgpa)
	{
		this.rno=rno;
		this.name=name;
		this.cgpa=cgpa;
	}
		void disp()
		{
			System.out.println("rno: "+rno);
			System.out.println("name: "+name);
			System.out.println("cgpa: "+cgpa);
		}
}
class Main
{
	public static void main(String args[])
	{
		Student s=new Student(1,"abc",9.8f);
		s.disp();
	}
}