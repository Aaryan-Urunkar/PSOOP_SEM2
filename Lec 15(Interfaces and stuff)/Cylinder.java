import java.util.Scanner;

public class Cylinder implements Volume,SurfaceArea{
    int r, h;
    public double getVolume(){
       return  Math.PI * r * r * h;
    }
    public double getSurfaceArea(){
        return 2 * Math.PI * r* (h+r);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius and height of cylinder: ");
        r = sc.nextInt();
        h = sc.nextInt();
    }
}
