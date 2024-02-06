import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Employee ob=new Employee();
        System.out.println("WELCOME TO EMPLOYEE DETAILS SETTER PROGRAM \n Initial/Default details: ");
        ob.display();
        System.out.println("\nEnter employee name: ");
        ob.setName(sc.nextLine());
        System.out.println("\nEnter employee age: ");
        ob.setAge(sc2.nextInt());
        System.out.println("\nEnter employee salary: ");
        ob.setSalary(sc2.nextInt());
        ob.display();
    }
}
