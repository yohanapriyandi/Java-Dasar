public class ForEach {
    public static void main(String[] args) {

        String[] names ={
          "Fathar", "Dhabit", "Adz-Dzaky", "CEO", "For", "Future"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");
//        FOR EACH menyederhanakan fungsi for klasik

        for (var name: names){
            System.out.println(name);
        }

    }
}
