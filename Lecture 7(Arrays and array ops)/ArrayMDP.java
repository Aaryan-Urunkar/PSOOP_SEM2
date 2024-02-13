import java.util.Scanner;

public class ArrayMDP {
    int size;
    int[] arr;
    Scanner sc=new Scanner(System.in);

    void input(){
        
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }

    void display(){
        System.out.println("Displaying elements");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    int binarySearch(int elem){
        int s=0, e=arr.length-1;
        int mid=0;
        boolean res=false;
        while(s<=e){
            mid= s+(e-s)/2;
            if(arr[mid] > elem){
                e=mid-1;
            }else if(arr[mid]<elem){
                s=mid+1;
            } else {
                res = true;
                break;
            }
        }
        return res == true? mid :-1;
    }

    void sort(){
        int i=0;
        while(i<arr.length-1){
            int j=i+1;
            while(j>0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
                j--;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        //Creating object and taking size of array
        ArrayMDP ob=new ArrayMDP();
        ob.size = sc.nextInt();
        ob.arr= new int[ob.size];
        while(true){
            System.out.println("1.Accept elements 2.Display elements 3. Search element 4.Sort array");
            int ch=sc.nextInt();
            if(ch == 1){
                ob.input();
            } else if(ch == 2){
                ob.display();
            } else if(ch ==3 ){
                System.out.println("Enter element to be searched");
                int p=ob.binarySearch(sc.nextInt());
                System.out.println( p>=0 ?"Element present in array at index " + p:"Element not present in array");
            } else if(ch == 4){
                ob.sort();
            } else {
                break;
            }
        }
    }
}
