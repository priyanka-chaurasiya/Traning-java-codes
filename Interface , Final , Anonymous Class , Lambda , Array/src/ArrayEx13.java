public class ArrayEx13 {

    public static void main(String[] args) {

        int a[] = new int[0];
        int x[] = {};
        int y[] = new int[]{};

        // int aa[] = new int[-1]; // Runtime Error

        int d[] = new int['a'];      // size = 97
        int aaa[] = new int[7 / 2];  // size = 3
        int aaaa[] = new int[-(-2)]; // size = 2

        Object o = new int[3];

        int b[] = new int[100];

        // System.out.println(b[-2]); // Runtime Error

        System.out.println(b[7 / 2]); // index 3
        System.out.println(b['a']);   // index 97
    }
}