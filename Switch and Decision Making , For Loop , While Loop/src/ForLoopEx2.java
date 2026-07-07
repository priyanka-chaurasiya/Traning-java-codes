
public class ForLoopEx2 {
	public static void main(String[] args) {
		for(int a=1;a<=5;) {
			System.out.println("Priyanka");
			a++;
		}
		System.out.println("--------------");
		int a=1;
		for(;a<=5;) {
			System.out.println("Priyanka");
			a++;
		}
		System.out.println("--------------");
		for(;;) {  //Infinite Loop
			System.out.println("Priyanka");
		}
		//System.out.println("bye");//error
	}

}