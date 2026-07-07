
public class Armstrong {
	public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }

        if (temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }


}
