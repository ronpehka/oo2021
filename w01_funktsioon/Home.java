import java.util.Scanner;
public class Home {  
      public static void main(String[] args) {
        
        String name;
        int salary;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        name = scan.nextLine();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary = in.nextInt();
        
        Scanner as = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = as.nextInt();

    
        System.out.println("Your name is " + name + " you are " + age + " years old" + " and you earn " + salary +" euros");
        
  }
}

