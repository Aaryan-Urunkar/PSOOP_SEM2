public class Transaction extends Stock{

    int result(boolean holding, int index, int[] arr, int profit){
        if(index >= arr.length){
            return profit;
        } else if(holding == true){
            int released = result(false, index+1, arr, profit + arr[index]);
            int retained = result(holding, index+1, arr, profit);
            return released>retained?released: retained;
        } else {
            int buy = result(true, index+1, arr, profit - arr[index]);
            int ignore = result(false,index+1,arr,profit);
            return buy>ignore?buy:ignore;
        }
    }

    public static void main(String[] args) {
        Transaction ob = new Transaction();
        int a =ob.result(false, 0, ob.stocks, 0);
        System.out.println("Total profit earned is: " + a);
    }
    
}
