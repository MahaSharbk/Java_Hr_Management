/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_management;

import java.util.Scanner;

 
 
public class Account {

	private float basicSalary ; 
	private float bonus ; 
	private float deducation ; 
	private float salaryAdvance ;
	public Account(float basicSalary, float bonus, float deducation, float salaryAdvance) {
		super();
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.deducation = deducation;
		this.salaryAdvance = salaryAdvance;
	}
	
	public Account() {
		super();
		
	}
	
	public String viewSalary() {
		StringBuilder b = new StringBuilder() ; 
		b.append("Basic Salary :"  + basicSalary + "\n") ; 
		b.append("Bonus :"  + bonus + "\n") ; 
		b.append("Deducations :"  + deducation + "\n") ; 
		b.append("Salary advances :"  + salaryAdvance + "\n") ;
		System.out.println(b.toString());
		return b.toString() ;  
	}
	
	public float calculateSalary() {
		float result =  0f ; 
		result = basicSalary  + bonus - deducation - salaryAdvance ; 
		return result ; 
		
	}
	
	public void enterAccountDetails() {
                Scanner scan=new Scanner(System.in);
		System.out.println("Enter Basic salary : ");
		this.basicSalary = scan.nextFloat();
		System.out.println("Enter the bonus : ");
		this.bonus =  scan.nextFloat();
		System.out.println("Enter deducation : ");
		this.deducation =  scan.nextFloat();
		System.out.println("Enter salary advance : ");
		this.salaryAdvance =  scan.nextFloat();
	}
	
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDeducation() {
		return deducation;
	}
	public void setDeducation(float deducation) {
		this.deducation = deducation;
	}
	public float getSalaryAdvance() {
		return salaryAdvance;
	}
	public void setSalaryAdvance(float salaryAdvance) {
		this.salaryAdvance = salaryAdvance;
	} 
	
	
}

