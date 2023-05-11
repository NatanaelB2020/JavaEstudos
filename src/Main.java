public class Main {
    public static void main(String[] args) {

        int n = 0;

        while (n < 15) {
            System.out.println(n);
            n++;
            if (n % 3 == 0) {
                System.out.println("fizz");
            };
            if (n % 5 == 0) {
                System.out.println("buzz");
            };
        }
    }
}