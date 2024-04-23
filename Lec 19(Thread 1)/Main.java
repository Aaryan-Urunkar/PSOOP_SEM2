public class Main {
    public static void main(String[] args) {
        NumberGen ob=new NumberGen();
        Thread numGenThread = new Thread(ob);
        numGenThread.start();
        for(long i=0;i<100000000;i++);
        Thread SquareCalculator = new Thread(new SquareCalc((int)ob.num));
        Thread CubeCalculator = new Thread(new CubeyCalc((int)ob.num));
        SquareCalculator.start();
        CubeCalculator.start();
    }
}
