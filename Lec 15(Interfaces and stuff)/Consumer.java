import java.util.Scanner;

public class Consumer implements EatHere, TakeAway {
    long orderno;
    int price;

    public double dispatchOrder() {
        //Calculating convenience fee to be applied
        if(0.05*price > 45){
            return 1.05 * price;
        } else {
            return price + 45;
        }
    }

    public double deliverOnTable() {
        //Calculating delivery fee to be applied
        if(0.1*price < 500){
            return 1.1*price;
        } else {
            return price + 500;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter order no and price");
        Consumer c = new Consumer();
        c.orderno = sc.nextLong();
        c.price = sc.nextInt();
        System.out.println("Enter 1 if home delivery or 0 if eating here");
        int ch = sc.nextInt();
        if(ch != 0){
            System.out.println("Total price: " + c.dispatchOrder());
        } else {
            System.out.println("Total price: " + c.deliverOnTable());
        }
    }
}
