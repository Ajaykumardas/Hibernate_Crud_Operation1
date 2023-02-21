package com.qsp.hybernate.crud.service;

import java.util.List;

import com.qsp.hybernate.crud.dao.StudentDao;
import com.qsp.hybernate.crud.dto.Student;

public class StudentService {
	StudentDao dao=new StudentDao();
	
	public void insertStudent(Student student)
	{
		dao.insertStudent(student);
	}
	
	public void updateStudent(Student student)
	{
		String name=student.getName();
		if(name.length()<=8)
		{
	   dao.updateStudent(student);
		}
		else
			System.out.println("enter name less than 8 or 8 character");
	}
	
	public void deleteStudent(Student student)
	{
		dao.deleteStudent(student);
	}
	
	public List<Student> displayStudent()
	{
	return dao.displayStudent();	
	}
	


}
