package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.*;
public class StudentMain {
	static Student data[]=new Student[4];

	public StudentMain() {
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[]{85,79,95});
		data[1]=new Student(null, new int[] {14,89,56});
		data[2]=null;
		data[3]=new Student("Manoj",null);
	}
	public static void main(String[] args) throws Exception{
		String str;
		StudentMain ob=new StudentMain();
		StudentReport ob1=new StudentReport();
		for(Student e:data)
		{
			try {
			str=ob1.validate(e);
			if(str.contentEquals("Valid")==true)
				System.out.println("Result : "+ob1.findGrades(e));
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
			
		}
		StudentService ob2=new StudentService();
		System.out.println("Number of null marks arrays objects: "+ob2.findNumberOfNullMarksArray(data));
		System.out.println("Number of null name objects: "+ob2.findNumberOfNullName(data));
		System.out.println("Number of null objects: "+ob2.findNumberOfNullObjects(data));

	}
}
