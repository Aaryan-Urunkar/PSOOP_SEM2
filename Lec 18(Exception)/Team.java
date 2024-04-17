import java.util.InputMismatchException;
import java.util.Scanner;

public class Team {

    void sort(Cricketer[] team){
        for(int i = 0;i<5;i++){
            Cricketer s = team[i];
            int pos=i;
            for(int j=i+1;j<5;j++){
                Cricketer next = team[j];
                if(s.bat_avg > next.bat_avg){
                    s = next;
                    pos = j;
                } 
            }
            Cricketer temp = team[i];
            team[i] = s;
            team[pos] = temp;
        }

        //DISPLAYING EVERYTHING

        for(Cricketer c : team){
            System.out.println("NAME: " + c.name + "\n BAT_AVG: " + c.bat_avg + " \n \n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        Cricketer team[] = new Cricketer[5];
        try{
            for(int i=0;i<5;i++){
            System.out.println("Enter name, runs, innings count, not out count: ");
            team[i] = new Cricketer();
            team[i].name = sc.nextLine();
            team[i].runs = sc1.nextInt();
            team[i].innings = sc1.nextInt();
            team[i].not_out = sc1.nextInt();
            team[i].setAvg();
            }
            Team ob =new Team();
            ob.sort(team);
        }catch(InputMismatchException e){
            e = new Handle4();
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            e = new Handle1();
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            e=new Handle2();
            System.out.println(e.getMessage());
        }
    }

}
