import java.util.Arrays;
import java.util.Scanner;

class GradesStats{
    int arr[];
    Scanner sc=new Scanner(System.in);

    GradesStats(int s){
        arr = new int[s];
    }

    void input(){ //Taking input in array
        System.out.println("Enter marks: ");
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the marks for student" + (i+1) + "=");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    int[] findMaxAndMin(int[] arr){ //Returning an array of 2 elements containing maximum and minimum
        int[] arr1 = sort(arr);
        int[] maxAndMin = new int[2];
        maxAndMin[0] = arr1[0];
        maxAndMin[1] = arr1[arr1.length-1];
        return maxAndMin;
    }

    int[] sort(int[] Arr){ //Insertion sort to sort array
        int i=0;
        while(i<Arr.length-1){
            int j=i+1;
            while(j>0){
                if(Arr[j] < Arr[j-1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j-1];
                    Arr[j-1] = temp;
                } else {
                    break;
                }
                j--;
            }
            i++;
        }
        return Arr;
    }

    double avg(int[] arr){ //Finding average
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return (double)sum/arr.length; 
    }

    double findMedian(int arr[]){
        int arr1[] = sort(arr);
        double median=0;
        if(arr.length %2 == 1){
            median = arr[arr.length/2];
        } else {
            median= (double)(arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
        }
        return median;
    }

    double findSD(int[] arr){
        double mean = avg(arr);
        double SD=0;
        for(int i =0;i<arr.length;i++){

            SD+= (double)Math.pow((arr[i]-mean),2);
        }
        return Math.sqrt(SD/arr.length);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of students");
        GradesStats ob=new GradesStats(sc.nextInt());
        ob.input();
        System.out.println("The average is= " + ob.avg(ob.arr));
        System.out.println("The median is= " + ob.findMedian(ob.arr) );
        int[] MnM = ob.findMaxAndMin(ob.arr);
        System.out.println("The minimum is= " + MnM[0]);
        System.out.println("The maximum is= " + MnM[1]);
        //System.out.println(Arrays.toString(ob.arr));
        System.out.println("The deviation is= " + ob.findSD(ob.arr));
    }
}