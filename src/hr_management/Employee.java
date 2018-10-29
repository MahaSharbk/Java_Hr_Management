/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

	
	private int id  ;
        private static int counter=0;
	private String firstName ; 
	private String lastName ; 
	private Date birthDate; 
	private EmpStatus status ; 
	private Date startDate ; 
	private String mobilePhone ; 
	private String area ; 
	private String street ; 
	private Account account ;
	
	public Employee() {
		super();
                counter=counter+1;
                this.id=counter;
	}
	
	public Employee( String firstName, String lastName, Date birthDate, int status, Date startDate,
			String mobilePhone, String area, String street, Account account) {
		super();
		 counter=counter+1;
                this.id=counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.status = EmpStatus.getValue(status);
		this.startDate = startDate;
		this.mobilePhone = mobilePhone;
		this.area = area;
		this.street = street;
		this.account = account;
	}


	public int getId() {
		return id;
	}
 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public EmpStatus isStatus() {
		return status;
	}

	public void setStatus(EmpStatus status) {
		this.status = status;
	}
public void setStatus(int numVal) {
		this.status = EmpStatus.getValue(numVal);
	}
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	} 
	
	
	
		@Override
	public String toString() {
	
		StringBuilder b = new StringBuilder() ; 
		b.append("Id : " + id + "\n") ; 
		b.append("First Name : " + firstName + "\n") ; 
		b.append("Last Name : " + lastName + "\n") ; 
		b.append("Birth Date : " + birthDate + "\n") ; 
		b.append("Status : " + status + "\n") ; 
		b.append("Start Date : " + startDate + "\n") ; 
		b.append("Mobile Phone : " + mobilePhone  + "\n") ; 
		b.append("Area : " + area  + "\n") ; 
		b.append("Street : " +  street + "\n") ; 
		b.append("Account : \n " + account.viewSalary() + "\n") ; 
		float n = account.calculateSalary() ; 
		b.append("Total salary : " + n + "\n") ; 
		System.out.println(b.toString());
		return b.toString() ; 
	}
	
	  

	public void enterNewEmployee() {
		Scanner scan = new Scanner(System.in) ; 
	 
		System.out.println("Enter the Employee first name : ");
		this.firstName = scan.nextLine();
		System.out.println("Enter the Employee last name : ");
		this.lastName = scan.nextLine();
		System.out.println("Enter the Employee birth date (yyyy/mm/dd) : ");
		try {
		 this.birthDate =new SimpleDateFormat("yyyy/mm/dd").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.birthDate= null ; 
		}
                System.out.println("Enter the Employee start date (yyyy/mm/dd) : ");
		try {
			this.startDate =new SimpleDateFormat("yyyy/mm/dd").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.startDate= null ; 
		}
		System.out.println("Enter the Employee status (Num Value) : ");
                
                int tempStatus=Integer.parseInt( scan.nextLine());
		this.status = EmpStatus.getValue(tempStatus);
		
		System.out.println("Enter the Employee mobile number : ");
		this.mobilePhone = scan.nextLine();
		System.out.println("Enter the Employee area : ");
		this.area = scan.nextLine();
		System.out.println("Enter the Employee street : ");
		this.street = scan.nextLine();
		System.out.println("Start enterint Employee account : ");
		this.account =new Account() ; 
		this.account.enterAccountDetails();
		
		
	}
	
	
	
}

