import java.util.Scanner;

public class Increment extends Employee{
    int incrementFactor;
    Increment(int incrementFactor){
        super();
        this.incrementFactor = incrementFactor;
    }

    void calcSalary(){
        System.out.println("Salary of employee is: " + (super.basic_sal*(((double)incrementFactor/100) + 1)));
    }
    public static void main(String[] args) {
        Increment ob;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 if employee is permanent and 0 if employee is temporary: ");
        int ch = sc.nextInt();
        if(ch==1){
            ob=new Increment(10);
        } else {
            ob = new Increment(5);
        }
        ob.calcSalary();
    }
}
