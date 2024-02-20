import java.util.Scanner;

class Posting{
    
    int courseWork; 
    int AptTest; 
    int TechTest;
    int interview;
    Posting (int courseWork, int AptTest, int TechTest,int interview){
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;
    }
    
    Posting (int TechTest,int interview){
        this.TechTest = TechTest;
        this.interview = interview;
    }

    Posting (int interview){
        this.interview = interview;
    }

    void recruitProgrammer(int courseWork, int AptTest, int TechTest,int interview){
        if(courseWork < 20 || AptTest < 20 || TechTest < 20 || interview < 20){
            System.out.println("Criteria not met. Should not be recruited.");
        } else {
            int avg = courseWork + AptTest + TechTest + interview;
            avg= avg/4;
            if(avg>=80){
                System.out.println("Criteria met. Candidate eligible to be recruited.\n");
            } else {
                System.out.println("Criteria not met. Should not be recruited.\n");
            }
        }
    }

    void recruitTeamLeader(int TechTest, int interview){
        if(TechTest < 20 || interview < 20){
            System.out.println("Criteria not met. Should not be recruited.");
        } else {
            int avg = TechTest + interview;
            avg= avg/2;
            if(avg>=85){
                System.out.println("Criteria met. Candidate eligible to be recruited.\n");
            } else {
                System.out.println("Criteria not met. Should not be recruited.\n");
            }
        }
    }

    void recruitProjectManager(int interview){
        if(interview < 20){
            System.out.println("Criteria not met. Should not be recruited.");
        } else {
            int avg = interview;
            if(avg>=90){
                System.out.println("Criteria met. Candidate eligible to be recruited.\n");
            } else {
                System.out.println("Criteria not met. Should not be recruited.\n");
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Posting ob;
        while(true){
            System.out.println("1.Recruit Programmer \n 2.Recruit Team leader \n 3.Recruit project manager 4.Exit");
            int ch=sc.nextInt();
            if(ch == 1){
                System.out.println("Enter marks for coursework, aptitude test, technical test and interview: ");
                ob = new Posting(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                ob.recruitProgrammer(ob.courseWork, ob.AptTest, ob.TechTest, ob.interview);
            } else if(ch == 2){
                System.out.println("Enter marks for technical test and interview: ");
                ob = new Posting(sc.nextInt(),sc.nextInt());
                ob.recruitTeamLeader(ob.TechTest, ob.interview);
            } else if(ch == 3){
                System.out.println("Enter marks for interview: ");
                ob = new Posting(sc.nextInt());
                ob.recruitProjectManager(ob.interview);
            } else {
                break;
            }
        }
    }
}