import java.util.Scanner;

public class Date1 {
    int year;
    int month;
    int date;
    int hrs;
    int min;
    int sec;
    void setDate(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;

    }
    void setDate(int year, int month, int date,int hrs, int min){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }
    void setDate(int year, int month, int date,int hrs, int min, int sec){
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec=sec;
    }
    void displayDate(){
        System.out.println("YEAR : " + year + "\n"+
        "MONTH : " + month + "\n"+
        "DATE : " + date + "\n"+
        "HOUR : " + hrs + "\n"+
        "MINUTES : " + min + "\n"+
        "SECONDS : " + sec + "\n"
        );
    }
    public static void main(String[] args) {
        Date1 ob=new Date1();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Enter year,month, date, hours, mins, sec\n 2.Enter year,month, date, hours, mins\n  3.Enter year,month, date\n 4.Display data \n 5.Exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter values");
                        ob.setDate(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                        break;
                case 2: System.out.println("Enter values");
                        ob.setDate(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                        break;
                case 3: System.out.println("Enter values");
                        ob.setDate(sc.nextInt(), sc.nextInt(),sc.nextInt());
                        break;
                case 4: System.out.println("Displaying data entered so far: ");
                        ob.displayDate();
                        break;
                case 5: break;        
                default: System.out.println("Invalid input");                        
            }
            if(ch == 5) break;
        }
    }
}
