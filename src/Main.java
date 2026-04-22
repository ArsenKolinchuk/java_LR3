public class Main {
    public static void main(String[] args) {

        String text = "пільги=yes&обєм=1600";

        int amp = text.indexOf('&');

        String first = text.substring(0, amp);
        String second = text.substring(amp + 1);

        int eq1 = first.indexOf('=');
        String name1 = first.substring(0, eq1);
        String value1 = first.substring(eq1 + 1);

        int eq2 = second.indexOf('=');
        String name2 = second.substring(0, eq2);
        String value2 = second.substring(eq2 + 1);

        System.out.println(name1 + " = " + value1);
        System.out.println(name2 + " = " + value2);
    }
}
