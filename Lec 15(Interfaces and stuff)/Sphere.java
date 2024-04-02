import java.util.Scanner;

public class Sphere implements Volume, SurfaceArea{
    int r;
    public double getVolume(){
        return Math.PI * r * r*r * 4.0/3;
    }
    public double getSurfaceArea(){
        return Math.PI * 4 * r * r;
    }
    void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        r = sc.nextInt();
    }
}
