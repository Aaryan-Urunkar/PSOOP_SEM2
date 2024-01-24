import java.util.Scanner;

class primeInRange{
    void range(int n1,int n2){ //Checking for all prime numbers between n1 and n2
        int count=0;
        for(int i=n1;i<=n2;i++){
        if (isprime(i)==1){
            System.out.println(""+i);
            count++;
        }
        else
            continue;
        }
        System.out.println("The number of prime numbers is:"+count);
    }
    public int isprime(int x){
        for(int j=2;j<x;j++){ //Will check for potential divisors of a numbers from 2 to n-1
            if(x%j==0){ //If divisor found, number ain't prime so return 0
                return 0;
            }
        }
        return 1; //If no divisors found,return 1 i.e. true or n is prime
    }
    
    public static void main(String args[]){ //Logical entry point of the program
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to find the prime nubers.Enter the lower limit");
        int n1=sc.nextInt();
        System.out.println("Enter the upper limit");
        int n2=sc.nextInt();
        primeInRange p = new primeInRange();
        p.range(n1,n2);
    }
}