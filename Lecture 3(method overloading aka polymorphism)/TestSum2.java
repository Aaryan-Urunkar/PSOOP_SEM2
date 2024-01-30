import java.util.Scanner;

public class TestSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two real numbers:");
        double x=sc.nextDouble();
        double y= sc.nextInt();
        method_overloading2 ob=new method_overloading2();
        System.out.println(ob.sum(x,y));
    }
}
