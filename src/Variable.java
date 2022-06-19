public class Variable {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName;
        lastName = "Gosling";
        // menggunakan var harus menggunakan java versi 10 keatas!
//        var company = "Sun Microsystems";
        byte iniByte = 100;
        Byte iniByteObject = iniByte;
        String[][] members = {
                {"Teguh","Tri","Nugroho"},
                {"Eko","Kurniawan","Khanedi"}
        };
        System.out.println(members[0][0]);
        System.out.println(100%10);
    }
}
