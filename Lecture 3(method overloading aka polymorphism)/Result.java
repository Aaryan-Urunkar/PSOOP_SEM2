import java.util.Scanner;

public class Result {
    float s1,s2,s3,s4,s5;
    Result(float s1,float s2, float s3, float s4,float s5){
        this.s1 = s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;
    }
    Result(float s1,float s2, float s3, float s4){
        this.s1 = s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=0;
    }
    Result(float s1,float s2, float s3){
        this.s1 = s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=0;
        this.s5=0;
    }
    Result(float s1,float s2){
        this.s1 = s1;
        this.s2=s2;
        this.s3=0;
        this.s4=0;
        this.s5=0;
    }
    Result(float s1){
        this.s1 = s1;
        this.s2=0;
        this.s3=0;
        this.s4=0;
        this.s5=0;
    }
    
    void calcCGPA(int n){
        float CGPA=(s1+s2+s3+s4+s5)/(n*10);
        System.out.println("CGPA = "+ CGPA + " out of 10");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of subjects to add marks for: ");
        int no=sc.nextInt();
        System.out.println("Please enter marks of "+no+ " subjects: ");
        Result ob;
        if(no ==1){
            ob =new Result(sc.nextFloat());
        }else if(no == 2){
            ob =new Result(sc.nextFloat(), sc.nextFloat());
        } else if(no == 3){
            ob =new Result(sc.nextFloat(), sc.nextFloat(),sc.nextFloat());
        }
        else if(no == 4){
            ob =new Result(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        else {
            ob =new Result(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        ob.calcCGPA(no);
    }
}
