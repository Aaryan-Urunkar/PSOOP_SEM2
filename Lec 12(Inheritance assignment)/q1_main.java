import java.util.Scanner;

public class q1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter no.of students: ");
        int no_of_students = sc.nextInt();
        Physics p_marks[] = new Physics[no_of_students];
        Chemistry[] c_marks = new Chemistry[no_of_students];
        Maths[] m_marks = new Maths[no_of_students];
        
        //TAKING INPUT
        String nam;
        for(int i=0;i<no_of_students;i++){
            System.out.println("Enter student name: ");
            nam = sc1.next();
            p_marks[i] = new Physics();
            c_marks[i] = new Chemistry();
            m_marks[i] = new Maths();
            //Taking name input and setting it for all the subjects

            p_marks[i].name = nam;
            c_marks[i].name = nam;
            m_marks[i].name = nam;

            //Generating roll_no of student and storing
            p_marks[i].setRollNo();
            int rno = p_marks[i].roll_no;
            c_marks[i].roll_no = rno;
            m_marks[i].roll_no = rno;

            //Taking marks input for all subjects
            System.out.println("Enter PCM marks out of 100: ");
            p_marks[i].marks = sc.nextInt();
            c_marks[i].marks = sc.nextInt();
            m_marks[i].marks = sc.nextInt();

            //Finding total marks and storing
            int tot = p_marks[i].marks + c_marks[i].marks + m_marks[i].marks;
            p_marks[i].tot_marks = tot;
            c_marks[i].tot_marks = tot;
            m_marks[i].tot_marks = tot;
        }

        //DISPLAYING OUTPUT
        for(int i=0;i<no_of_students;i++){
            System.out.println("Name: " + c_marks[i].name);
            System.out.println("Roll no: " + c_marks[i].roll_no);
            System.out.println("PCM TOTAL: " + c_marks[i].tot_marks + "/300");
        }
    }
}
