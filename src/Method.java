public class Method {
    public static void main(String[] args) {
        var a = 2500;
        var b = 1550;
        var c = sum(a,b);
        sayHelloWorld("Fathar", "Dhabit Adz-Dzaky");
        System.out.println(c);
        System.out.println(hitung(20, "+", 5));
        System.out.println(hitung(20, "-", 5));
        System.out.println(hitung(20, "/", 5));
        System.out.println(hitung(20, "*", 5));
    }

//    method parameter
    static void sayHelloWorld(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static  int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return  value1 - value2;
            case "/":
                return value1 / value2;
            case "*":
                return value1 * value2;
            default:
                return 0;
        }
    }

//    method return value
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
}
