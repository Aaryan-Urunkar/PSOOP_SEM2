import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("AUDI DETAILS\n");
        System.out.println("Enter mileage, price, warranty, seating capacity, fuel type and model no: ");
        Audi audi = new Audi();
        audi.mileage = sc.nextFloat();
        audi.price = sc.nextInt();
        audi.warranty = sc.nextInt();
        audi.seating_capacity = sc.nextInt();
        audi.fuelType = sc1.next();
        audi.modelNo = sc.nextLong();
        System.out.println("AUDI DETAILS\n Mileage: " + audi.mileage + "\n Price: " + audi.price + "\n Warranty: " + audi.warranty + "\n Seating capacity: " + audi.seating_capacity + "\n Fuel type: " + audi.fuelType + "\n Model type: " + audi.modelNo);

        //FORD
        System.out.println("\n\nFORD DETAILS\n");
        System.out.println("Enter mileage, price, warranty, seating capacity, fuel type and model no: ");
        Audi ford = new Audi();
        ford.mileage = sc.nextFloat();
        ford.price = sc.nextInt();
        ford.warranty = sc.nextInt();
        ford.seating_capacity = sc.nextInt();
        ford.fuelType = sc1.next();
        ford.modelNo = sc.nextLong();
        System.out.println("FORD DETAILS\n Mileage: " + ford.mileage + "\n Price: " + ford.price + "\n Warranty: " + ford.warranty + "\n Seating capacity: " + ford.seating_capacity + "\n Fuel type: " + ford.fuelType + "\n Model type: " + ford.modelNo);

        //TVS
        System.out.println("\n\n TVS details: ");
        System.out.println("Enter mileage, price, no of cylinders, no of gears, cooling type, fuel tank size and make type: ");
        TVS tvs = new TVS();
        tvs.mileage = sc.nextFloat();
        tvs.price = sc.nextInt();
        tvs.noOfCylinders = sc.nextInt();
        tvs.noOfGears = sc.nextInt();
        tvs.coolingType = sc.next();
        tvs.fuelTankSize = sc.nextInt();
        tvs.makeType = sc.next();
        System.out.println("TVS DETAILS\n Mileage: " + tvs.mileage + "\n Price: " + tvs.price + "\n No of cylinders: " + tvs.noOfCylinders + "\n No of gears: " + tvs.noOfGears + "\n Cooling type: " + tvs.coolingType + "\n Make type: " + tvs.makeType);

    }
}
