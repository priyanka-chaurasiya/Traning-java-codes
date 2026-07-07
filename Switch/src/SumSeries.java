
public class SumSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("enter the num to find sum: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;

            System.out.print(i);

            if (i < n) {
                System.out.print(" + ");
            }

            i++;
        }

        System.out.print(" = " + sum);
      
    }

}
