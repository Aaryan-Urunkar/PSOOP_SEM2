import java.util.Scanner;

public class fraction{
    int a;
    int b;
    int c;
    int d;
    //a and c are nums whereas b and d are denominators

    fraction(){ //Default constructor
        a=b=c=d=1;
    }

    int Hcf(int m,int n){//To calculate hcf
        if(m<n){
            return Hcf(n,m);
        } else if(n != 0){
            return Hcf(n,m%n);
        } else {
            return m;
        }
    }

    void addition(int a,int b, int c, int d){
        int resNum = (a*d + b*c);  //Storing result of addition
        int resDen = (b*d);
        int gcd = Hcf(Math.abs(resNum),Math.abs(resDen));
        System.out.println("Result of addition: " + (resNum/gcd) + " / " + (resDen/gcd));
    }

    void subtraction(int a,int b, int c, int d){
        int resNum = (a*d - b*c);  //Storing result of subtraction
        int resDen = (b*d);
        int gcd = Hcf(Math.abs(resNum),Math.abs(resDen));
        System.out.println("Result of subtraction: "+ (resNum/gcd) + " / " + (resDen/gcd));
    }

    void multiplication(int a,int b, int c, int d){
        int resNum = (a*c);  //Storing result of multiplication
        int resDen = (b*d);
        int gcd = Hcf(Math.abs(resNum),Math.abs(resDen));
        System.out.println("Result of multiplication: " + (resNum/gcd) + " / " + (resDen/gcd));
    }

    void division(int a,int b, int c, int d){
        int resNum = (a*d);  //Storing result of division
        int resDen = (b*c);
        int gcd = Hcf(Math.abs(resNum),Math.abs(resDen));
        System.out.println("Result of multiplication: " + (resNum/gcd) + " / " + (resDen/gcd));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fraction ob=new fraction();
        System.out.println("Enter first numerator, first denominator, second numerator and second denominator: ");
        ob.a=sc.nextInt();
        ob.b=sc.nextInt();
        ob.c = sc.nextInt();
        ob.d = sc.nextInt();
        while(true){
            int ch=0;
            System.out.println(" 1.ADD \n 2.SUBTRACT \n 3.MULTIPLY \n 4.DIVIDE \n 5.EXIT");
            ch=sc.nextInt();
            if(ch == 1){
                ob.addition(ob.a,ob.b,ob.c,ob.d);
            } else if(ch == 2){
                ob.subtraction(ob.a,ob.b,ob.c,ob.d);
            }else if(ch == 3){
                ob.multiplication(ob.a,ob.b,ob.c,ob.d);
            }else if(ch == 4){
                ob.division(ob.a,ob.b,ob.c,ob.d);
            }else { break;}
        }
        System.out.println("\nEXITTED");
    }
}