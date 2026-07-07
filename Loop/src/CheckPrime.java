
public class CheckPrime {
	public static void main(String[] args) {
        int n = 7;
        boolean prime = true;

        if (n <= 1) prime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }


}
