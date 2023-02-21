package com.qsp.hybernate.crud.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.qsp.hybernate.crud.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ajay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insertStudent(Student student)
	{
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		System.out.println("data inserted");
	}
	
	public void updateStudent(Student student)
	{
		

		Student student1=entityManager.find(Student.class,student.getId());

		if(student1!=null)
		{
		student1.setName(student.getName());
		entityTransaction.begin();
		entityManager.merge(student1);
		entityTransaction.commit();
		System.out.println("updated");
		}
		else
			System.out.println("not available");
	}
	public void deleteStudent(Student student)
	{
		Student student1=entityManager.find(Student.class,student.getId());
		if(student1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(student1);
			entityTransaction.commit();
			System.out.println("deleted");
		}
		else
			System.out.println("not avalable");

		
	}
	public List<Student> displayStudent()
	{
		String select="select s from Student s";
	      Query query=entityManager.createQuery(select);
	      List<Student> list=query.getResultList();
	      return list ;
	      
	}

}
