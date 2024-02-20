import java.util.Scanner;

public class ITRETURN {
    Scanner sc = new Scanner(System.in);
    
    double salary;
    double capitalGains;
    double otherSources;
    double business;
    double house;
    double totIncome;

    double calculateIncomeTax(double salary, double business, double house){
        double income = (salary*12); //Gross salary
        System.out.println("Enter HRA and LTA to be deducted");
        income = income - sc.nextDouble() - sc.nextDouble(); //Deducting HRA and LTA from the taxable salary
        boolean male= true;
        System.out.println("Enter Y if you are male else enter N: "); //Taking gender input to calculate professional tax
        String s = sc.next();
        double Tax=0;
        if(s.charAt(0) == 'N' ){
            male = false;
        }
        if(male == true){ //Calculating professional tax or tax on salary
            if(income > 7500 && income <= 10000){
                Tax = (175*12);
            } else if(income > 10000){
                Tax = 300 + (200*11);
            }
        } else {
            if(income > 10000){
                Tax = 300 + (200*11);
            }
        }
        System.out.println("PT=" + Tax);
        income += (business + house); //Adding other sources of income
        //Calculating tax on overall income now
        if(income > 250000 && income <= 500000){
            Tax += (0.05*income);
        } else if(income > 500000 && income <= 1000000){
            Tax+=(0.2*income);
        } else if(income>1000000){
            Tax+=(0.3*income);
        }
        return Tax;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ITRETURN ob =new ITRETURN();
        System.out.println("Enter income from monthly salary: (otherwise enter 0 if you have no job)");
        ob.salary = sc.nextDouble();
        System.out.println("Enter income from business: (otherwise enter 0 if you don't have a business)");
        ob.salary = sc.nextDouble();
        System.out.println("Enter yearly income from house and other properties: (otherwise 0 if you have no such income)");
        ob.house = sc.nextDouble();
        System.out.println("Total income tax:"+ob.calculateIncomeTax(ob.salary, ob.business, ob.house));
    }
}
