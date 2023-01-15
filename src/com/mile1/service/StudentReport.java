package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentReport {
	public String findGrades(Student studentObject)
	{
	int c[];
	c=studentObject.getMarks();
	for(int i=0;i<c.length;i++)
	{
      if(c[i]<35)
      {
    	  studentObject.setGrade("F");
    	  return studentObject.getGrade();
      }
	}
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			sum+=c[i];
		}
		if(sum<150)
			   studentObject.setGrade("C");
		else if(sum<200)
			   studentObject.setGrade("B");
		else if(sum<250)
			   studentObject.setGrade("A");
		else
			   studentObject.setGrade("A+");
	return studentObject.getGrade();
	}
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
		if(s==null)
		{	
			throw new NullStudentObjectException();
		}
	      else 
			{
		if("".equals(s.getName()))
			   throw new NullNameException();
		 else if(s.getMarks()==null) 
			    throw new NullMarksArrayException();
	     else
	    	return "Valid";
			}
		}
}

