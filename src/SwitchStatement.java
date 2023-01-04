public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "C";

        switch (nilai){
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

//        menggunakan fungsi lambda
/*
* Untuk menggunakan fungsi lambda di java
* pastikan versi java yang  anda instal adalah versi 14 ke atas
* karena fungsi lambda baru hadir ketika java versi 14 dirilis
*
        switch (nilai){
            case "A" -> System.out.println("Wow, anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
//        Kata kunci yield hanya tersedia di java versi 14 ke atas

          ucapan switch (nilai){
            case "A":
            yield "Wow, anda lulus dengan baik";
            case "B", "C":
            yield "Nilai anda cukup baik";
            case "D":
            yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
            };
            System.out.println(ucaoan);

*
 */
    }
}
