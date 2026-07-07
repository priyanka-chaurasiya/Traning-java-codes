class My extends Object{
	int age;
	String name;
	My(String n,int a){
		name=n;
		age=a;
	}
	public String toString() {
        return name+" "+age;
    }
}
public class ToStringEx {
	public static void main(String[] args) {
		My m1=new My("Amit",20);
		My m2=new My("Aman",22);
		System.out.println(m1.toString());
		System.out.println(m2);
		
	}
}
