public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 78;
        String ucapan;

//        if (nilai >= 75){
//            ucapan = "Selamat nada lulus";
//        }else{
//            ucapan = "Silahkan coba lagi";
//        }

//        System.out.println(ucapan);

//        ternary operator
        ucapan = nilai >= 75? "selamat anda lulus":"Silahkan coba lagi";
        System.out.println(ucapan);
    }
}
