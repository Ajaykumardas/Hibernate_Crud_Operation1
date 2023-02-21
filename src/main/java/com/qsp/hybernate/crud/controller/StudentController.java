package com.qsp.hybernate.crud.controller;


import java.util.List;
import java.util.Scanner;

import com.qsp.hybernate.crud.dto.Student;
import com.qsp.hybernate.crud.service.StudentService;

public class StudentController {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Student student =new Student();
			StudentService service=new StudentService();
			while(true)
			{
			System.out.println("enter 1. for insert\n 2. for update\n 3. for delete\n 4. for display\n 5.1 for exist");
			int n=sc.nextInt();
               switch(n)
               {
               case 1:
               {
            	   System.out.println("enter id number");
            	   student.setId(sc.nextInt());
            	   System.out.println("enter name");
            	   student.setName(sc.next());
            	   System.out.println("enter location");
            	   student.setLoc(sc.next());
            	   service.insertStudent(student);
               }
               break;
               case 2:
               {
            	   
            	  System.out.println("enter id ");
            	  student.setId(sc.nextInt());
            	  System.out.println("eneter name you want set");
            	  student.setName(sc.next());
            	  service.updateStudent(student);
               }
               break;
               case 3:
               {
            	   System.out.println("Enter id");
            	   student.setId(sc.nextInt());
            	   service.deleteStudent(student);
            	   
               }
               break;
               case 4:
               {
            	   List<Student> student1=service.displayStudent();
            	   for (Student student2 : student1) {
					System.out.println("id is: "+student2.getId());
					System.out.println("name is: = "+student2.getName());
					System.out.println("location is: "+student2.getLoc());
					System.out.println("===============");
				}
            	   
               }
               break;
               case 5:
               {
            	   System.out.println("you are existed");
            	  System.exit(0); 
               }
               default:
            	   System.out.println("invalid choice");
               
               }
			
			}
				
	}

}
