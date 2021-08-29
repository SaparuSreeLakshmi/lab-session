package com.adminstrator;
import java.util.Scanner;
public class adminstrator {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength=8;
	public static void main (string[]args); 
    System.out.println("Please enter the department from the following");
    {
    int department=in.nextInt();
		if(department==1) {
			return "technical";
		}
		else if(department==2) {
			return "admin";
		}
		else if(department==3) {
			return "Human Resource";
		}
			else if(department==4) {
			return "Legal";
		}
		else {
			return "";
		}
	}
public email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department=setDepartment();
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password+"\n\n");
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department;
	}
	
	private String setDepartment() {
		System.out.print( "+firstName + "\department/1 for technical\2 admin\3 for human resourse\4 for legal: ");
	}
		private String randomPassword(int length) {
String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		}
	}
