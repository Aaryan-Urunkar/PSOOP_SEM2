import java.util.Scanner;

public class Shipment extends BoxWeight {
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    String date;
    int price;
    void addShipmentDetails(){
        System.out.println("Enter shipment due date in DD/MM/YYYY form: ");
        date = sc.nextLine();
        System.out.println("Enter shipment price:");
        price= sc1.nextInt();
    }
}
