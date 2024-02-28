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
        System.out.println("Enter box weight and dimensions");
        super.weight =sc1.nextInt();
        super.length = sc1.nextInt();
        super.breadth = sc1.nextInt();
        super.height = sc1.nextInt();
    }

    void display(){
        System.out.println("Due date: " + date);
        System.out.println("price= " + price);
        System.out.println("Weight= " + super.weight + " kg");
        System.out.println("Length=" + super.length);
        System.out.println("Width= " + super.breadth);
        System.out.println("Height= " + super.height);
        System.out.println("Volume= " + super.calcVolume());
    }
    public static void main(String[] args) {
        Shipment ob =new Shipment();
        ob.addShipmentDetails();
        ob.display();
    }
}
