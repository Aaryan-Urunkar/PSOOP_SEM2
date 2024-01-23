import java.util.Scanner;

public class calcCGPA {
    String name;
    int noOfSubjects;
    void CalcCGPA(){
        int sum=0;
        Scanner ob=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter no.of subjects");
        noOfSubjects= ob.nextInt();
        for(int i=1;i<=noOfSubjects;i++){
            System.out.println("Enter marks in subject " + i+ ": ");
            sum+=ob.nextInt();
        }
        double CGPA = (double)sum/(noOfSubjects*10);
        System.out.println("CGPA=" + CGPA);
    }
    public static void main(String[] args) {
        calcCGPA ob=new calcCGPA();
        ob.CalcCGPA();
    }
}
