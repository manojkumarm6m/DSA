package strings;

public class DefangIP {


    private static String defangIPaddr(String s) {
        return s.replace(".", "[.]");
//        return s;
    }


    public static void main(String[] args) {
        String ip = "192.168.0.1";
        System.out.println("Original IP: " + ip);
        System.out.println("Defanged IP: " + defangIPaddr(ip));
    }
}
