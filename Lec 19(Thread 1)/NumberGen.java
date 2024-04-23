public class NumberGen implements Runnable{
    double num;
   
    public void run() {
        num  = (int)(Math.random()*100);
        System.out.println(num);
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
