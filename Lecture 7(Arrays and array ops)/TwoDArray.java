import java.util.Scanner;

public class TwoDArray {
    Scanner sc=new Scanner(System.in);
    int[][] arr;
    void input(){
        
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void display(){
        System.out.println("Displaying elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TwoDArray ob=new TwoDArray();

        System.out.println("Enter rows and columns");

        ob.arr = new int[sc.nextInt()][sc.nextInt()];

        ob.input();
        ob.display();
        
    }   
}
