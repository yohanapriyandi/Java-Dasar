public class MethodvariableArgument {
    public static void main(String[] args) {

        int[] values = {95,84,82,79,97};
        sayCongrats("Fithriya Nabilah",values);
        sayCongrats("Yohan Apriyandi", 60,70,61,80,70);
        sayCongrats("Fathar Dhabit Adz-Dzaky", 80,75,88,80,70);
    }

//    Variable argument pendeklarasian menggunakan ... seperti int...
    static void sayCongrats(String name, int... values){

        var total = 0;

        for (var value: values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", kamu lulus");
        }else{
            System.out.println("Maaf " + name + ", kamu belum lulus");
        }
    }
}
