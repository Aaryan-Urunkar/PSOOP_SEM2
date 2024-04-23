import java.util.ArrayList;

public class SieveOfEratosthenesThread extends Thread{
    
    public void run() {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=2;i<=100;i++){
            if(a.contains(i)){
                continue;
            }
            for(int j=i+i;j<=100;j+=i){
                a.add(j);
            }
            System.out.println(i);
        }
    }
}
