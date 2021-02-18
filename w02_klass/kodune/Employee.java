package kodune;
public class Employee {

   String name;
   int age;
   String job;
   double salary;

   // constructor
   public Employee(String name) {
      this.name = name;
   }

   // vanus
   public void empAge(int empAge) {
      age = empAge;
   }

   
   public void empJob(String empJob) {
      job = empJob;
   }


   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   /* Välja print*/
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Job:" + job );
      System.out.println("Salary:" + salary);
   }
}