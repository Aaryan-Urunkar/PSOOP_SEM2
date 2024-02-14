import java.util.Scanner;

public class Book {
    int[][] bookRating;
    Scanner sc=new Scanner(System.in);
    
    Book(int n){
        bookRating = new int[n][4];
    }
    void input(){
        for(int i =0;i< bookRating.length;i++){
            System.out.println("Enter 4 ratings for reader " + (i+1));
            for(int j=0;j<bookRating[0].length;j++){
                bookRating[i][j] = sc.nextInt();
            }
        }
    }
    void bestBook(){
        double[] arr = new double[4];
        for(int i=0;i<4;i++){
            double br=0;
            for(int j=0;j<bookRating.length;j++){
                br+=bookRating[j][i];
            }
            arr[i] = br/bookRating.length;
        }
        System.out.println("The most popular book is: Book" + (maxIndex(arr)+1));
    }

    int maxIndex(double[] arr){ //Finding book with maximum average ratings
        int ind=0;
        for(int i=0;i<arr.length;i++){
            ind = arr[ind] > arr[i ]? ind:i;
        }
        return ind;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of readers: ");
        Book ob=new Book(sc.nextInt());
        ob.input();
        ob.bestBook();
    }
}
