public class SquareCalc implements Runnable{
    int a;
    SquareCalc(int a){
        this.a=a;
    }
    public void run() {
        System.out.println("Square= " + a*a);    
    }
}
