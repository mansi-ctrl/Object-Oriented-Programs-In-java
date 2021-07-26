/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
/*
Name:Mansi Dobariya
RollNo:AU1841131
Descrition: a Java program which creates Employee class
*/

/**
 *
 * @author mansi
 */
public class Employee {
    
private int employeeID;
    private String firstName;
    private String lastName;
    private int basicSalary;
    private int Experience;

    /**
     * @param args the command line arguments
     */
    //constructor
    public Employee(int employeeID, String firstName, String lastName, int basicSalary,int Experience) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.Experience=Experience;
    }

    //method
    int getId(){
        return employeeID;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastname(){
        return lastName;
    }
    String Name(){
   
     return firstName  + lastName;
    }
    int getSalary(){
        return basicSalary;
    }
    void setSalary(int Salary){
        Salary=basicSalary;
    }
    int AnnualSalary(){
    int Salary=basicSalary;
        return Salary*12;
    }
  public boolean raiseSalarystatic(float raisePercent) {
       boolean isRaised = false;
    if (this.Experience >= 10) {
           basicSalary += raisePercent * basicSalary / 100;
          isRaised = true;
        }
       System.out.println("Increased Basic Salary =" + basicSalary);
       return isRaised;}

    
}

 class EmployeeSalaryProgram {

    public static void main(String[] args) {
    Employee e[]=new Employee[5];
      e[0] = new Employee(475, " Mansi ", " Dobariya ", 15000,10);
        e[1] = new Employee(454, " Mansi ", " Dobariya ", 15000,18);
      e[2] = new Employee(785, " Mansi ", " Dobariya ", 15000,50);
      e[3] = new Employee(175, " Mansi ", " Dobariya ", 15000,12);
      e[4] = new Employee(675, " Mansi ", " Dobariya ", 15000,13);
      
        for (int i = 0; i < 10; i++) {
           
            System.out.println("EmployeeID :"+e[i].getId()+" "+"Employee Name: "+e[i].Name()+" "+
                    "Salary:"+e[i].getSalary()+" "+"Annual Salary: "
                    +e[i].AnnualSalary()+" "+" Raise Salary :"+e[i].raiseSalarystatic(7f));
        }
    }

    @Override
    public String toString() {
        return "EmployeeSalaryProgram{" + '}';
    }

}
/*
run:
Increased Basic Salary =16050
EmployeeID :475 Employee Name:  Mansi  Dobariya  Salary:15000 Annual Salary: 180000  Raise Salary :true
Increased Basic Salary =16050
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
EmployeeID :454 Employee Name:  Mansi  Dobariya  Salary:15000 Annual Salary: 180000  Raise Salary :true
Increased Basic Salary =16050
EmployeeID :785 Employee Name:  Mansi  Dobariya  Salary:15000 Annual Salary: 180000  Raise Salary :true
Increased Basic Salary =16050
EmployeeID :175 Employee Name:  Mansi  Dobariya  Salary:15000 Annual Salary: 180000  Raise Salary :true
Increased Basic Salary =16050
EmployeeID :675 Employee Name:  Mansi  Dobariya  Salary:15000 Annual Salary: 180000  Raise Salary :true
*/
