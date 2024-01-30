import java.util.Scanner;

public class TestSum {
    //Driver code
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Method_overloading1 ob=new Method_overloading1();
        System.out.println("Enter number of values: ");
        int n=sc.nextInt();
        if(n==2){
            System.out.println((float)ob.sum(10, 20 )/2);
        } else if(n == 3){
            System.out.println((float)ob.sum(10, 20 ,35)/3);
        }
        int[]arr=new int[n];
        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println((float)ob.sum(arr)/n);
        
    }
}
