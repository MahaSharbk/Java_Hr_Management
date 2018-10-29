/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_management;


public enum EmpStatus {
    //Enum Values
    Active(1),
    Retired(2),
    Resigned(3),
    Deleted(4);
    
    private  int numVal;
    
    //Constructor
     EmpStatus(int numVal){
        this.numVal=numVal;
    }
    //Getter
    public int getNumVal(){
        return this.getNumVal();
    }
     
    //Method to get enum val (Active, Deleted,...) by passing numVal
    public static EmpStatus getValue(int numVal) {
      for (EmpStatus l : EmpStatus.values()) {
          if (l.numVal == numVal) return l;
      }
      //if parameter not exists thow exception
      throw new IllegalArgumentException("Leg not found. Amputated?");
   }
}
