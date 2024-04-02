import java.util.Scanner;

public class Customer implements SavingsAccount, CurrentAccount{
    String acc_type;
    int r; //Interest rate
    int p; //Principal or balance

    //n is assumed as time in no.of years
    public double getSimpleInterest(int n){
        return ((double)p * r *n)/100;
    }
    public double getCompoundInterest(int n){
        return p * Math.pow(1 + ((double)r/100), n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Enter account type(Savings or Current): ");
        c.acc_type = sc.nextLine();
        System.out.println(" Enter rate of interest, time in years and principal amoount");
        c.r = sc1.nextInt();
        int t = sc1.nextInt();
        c.p = sc1.nextInt();
        //Applying appropriate interest based on type of account
        if(c.acc_type.equalsIgnoreCase("savings")){
            System.out.println("Amount of interest applied for given time = " + c.getSimpleInterest(t));
        } else if(c.acc_type.equalsIgnoreCase("current")){
            System.out.println("Amount of interest applied for given time period = " + c.getCompoundInterest(t));
        }
    }
}
