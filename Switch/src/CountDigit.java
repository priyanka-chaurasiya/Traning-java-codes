
public class CountDigit {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
	            int count=0;
				while (num>0) {
				  //int a=num%10; // for reverse num
				  //System.out.println("Reverse of the number"+a); //for reverse num	
					num=num/10;
				  count+=1;
				}
				  System.out.println("Digit if the number"+count);
				  
	}

}
