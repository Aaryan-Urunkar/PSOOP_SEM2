import java.util.Scanner;

public class Time {
    
    int totSeconds, totMin, totHours;
    
    void conversion1(){
        totHours = totSeconds/3600;
        totSeconds=totSeconds%3600;
        totMin = totSeconds/60;
        totSeconds = totSeconds%60;
        System.out.println("Hours:" + totHours);
        System.out.println("Minutes: " + totMin);
        System.out.println("Seconds: " + totSeconds);
    }

    void conversion2(){
        int sec=totSeconds;
        sec+= (totMin*60);
        sec+=(totHours*60*60);
        System.out.println("Total seconds= " + sec);
    }

    public static void main(String[] args) {
        Time ob=new Time();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Convert seconds to hours, minutes and seconds \n 2.Convert hours, minutes and seconds to seconds");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("PLease enter total seconds: ");
            ob.totSeconds = sc.nextInt();
            ob.conversion1();
        } else if(ch == 2){
            System.out.println("Enter hours, mins and secs");
            ob.totHours = sc.nextInt();
            ob.totMin = sc.nextInt();
            ob.totSeconds = sc.nextInt();
            ob.conversion2();
        }
        else {
            System.out.println("Invalid input.");
        }
    }
}
