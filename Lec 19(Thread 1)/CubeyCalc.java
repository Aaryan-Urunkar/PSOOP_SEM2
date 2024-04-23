public class CubeyCalc implements Runnable{
    int a;
    CubeyCalc(int a){
        this.a=a;
    }
    public void run() {
        System.out.println("Cube= " + a*a*a);    
    }
}
