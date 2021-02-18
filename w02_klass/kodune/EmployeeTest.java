package kodune;

public class EmployeeTest {
    
   public static void main(String args[]) {
    /* Objektid */
    Employee empOne = new Employee("James Smith");
    Employee empTwo = new Employee("Mary Anne");

    // Ja assigning values
    empOne.empAge(26);
    empOne.empJob("Senior Software Engineer");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empJob("Software Engineer");
    empTwo.empSalary(500);
    empTwo.printEmployee();
 }
}

