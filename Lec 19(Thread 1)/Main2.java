public class Main2 {
    public static void main(String[] args) {
        SieveOfEratosthenesThread ob = new SieveOfEratosthenesThread();
        ob.start();

        PalindromeThread ob2 = new PalindromeThread();
        ob2.start();
    }
}
