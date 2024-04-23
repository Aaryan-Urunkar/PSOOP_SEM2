public class PalindromeThread extends Thread{
    
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i=10;i<=1000;i++){
            int rev=0;
            int n=i;
            while(n!=0){
                rev = (rev*10) + (n%10);
                n/=10;
            }
            if(rev == i){
                System.out.println(i);
            }
        }
        
    }
}
