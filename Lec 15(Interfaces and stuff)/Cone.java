import java.util.Scanner;

public class Cone implements Volume,SurfaceArea {
    int r,l,h;
    public double getVolume(){
        return Math.PI * r * r  * h/3.0;
    }

    public double getSurfaceArea(){
        return Math.PI * r * (r+l);
    }

    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius, height and slant height: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
    }
}
