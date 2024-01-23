import java.util.*;
public class TestStudent4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student Aaryan =new Student();
        Student Darshan = new Student();
        System.out.println("Enter details of student 1");
        Aaryan.setRecord(sc.nextInt(), sc.next());
        System.out.println("Enter details of student 2");
        Darshan.setRecord(sc.nextInt(), sc.next() );
        Aaryan.displayRecord();
        Darshan.displayRecord();
    }
}
