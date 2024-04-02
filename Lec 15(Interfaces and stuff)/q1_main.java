import java.util.Scanner;

public class q1_main {
    public static void main(String[] args) {
        //Menu driven program using switch case

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate surface area of : \n 1.Sphere \n 2.Cylinder \n 3.Cone\n ENter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Sphere ob =new Sphere();
                ob.input();
                System.out.println("Volume: " + ob.getVolume());
                System.out.println("Surface area: " + ob.getSurfaceArea());
                break;

            case 2:
                Cylinder ob1 =new Cylinder();
                ob1.input();
                System.out.println("Volume: " + ob1.getVolume());
                System.out.println("Surface area: " + ob1.getSurfaceArea());
                break;
             
            case 3:
                Cone ob2 =new Cone();
                ob2.input();
                System.out.println("Volume: " + ob2.getVolume());
                System.out.println("Surface area: " + ob2.getSurfaceArea());
                break;    
        
            default:
            System.out.println("INvalid choice");
                break;
        }
        
    }
}
