public class TypeDataBukanPrimitif {
    public static void main(String[] args) {
        Byte iniByte = null;
//        iniByte = 20;
        Integer iniInteger = 25;
        Long iniLong = 25L;

        System.out.print(iniByte);

//         Konversi dari type data primitif ke type data object

        int age = 33;
        Integer ageObject = age;
        short iniShort = ageObject.shortValue();

        Long amount = 1000000L;
        amount.byteValue();
    }
}
