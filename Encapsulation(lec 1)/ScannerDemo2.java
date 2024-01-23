import java.util.*;
class ScannerDemo2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0, count=0;
        System.out.println("Enter number of values to be added");
        int noOfValue=sc.nextInt();
        while(count<noOfValue){
            sum += sc.nextInt();
            count++;
        } 
        int mean = sum/count;
        System.out.println("mean" + mean );
    }
}