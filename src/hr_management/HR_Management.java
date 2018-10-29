/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_management;

import java.util.ArrayList;
  
public class HR_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> emps=new ArrayList<>();
        emps.add(new Employee());
        emps.get(0).enterNewEmployee();
        emps.get(0).toString();
		 
	}
    
}
