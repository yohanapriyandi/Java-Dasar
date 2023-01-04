public class OperasiMath {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("==============Contoh Augmented Assignments================");
        System.out.println("============== -= - += - *= ================");
        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        System.out.println("==============Unary Operator================");

        int d = 100;
        int e = -10;

        d++;
        System.out.println(d);
        d--;
        System.out.println(d);


    }
}
