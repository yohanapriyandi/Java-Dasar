public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[5];

        arrayString[0] = "Fathar";
        arrayString[1] = "Dhabit";
        arrayString[2] = "Adz-Dzaky";

        System.out.println(arrayString[0]);

        arrayString[0] = "Yohan";

        System.out.println(arrayString[0]);
//          Cara lain pendekalarasian array di java
        String[] namaBaru = {
            "Fathar", "Dhabit", "Adz-Dzaky"
        };

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        System.out.println(arrayInt.length);

//        Membuat array di dalam array
        String [][] members = {
                {"yohan", "apriyandi"},
                {"fithriya", "Nabila"},
                {"fathar", "Dhabit", "Adz-dzaky"}
        };

        System.out.println(members[2][1]);
    }
}
