public class Main {
    public static void main(String[] args) {

        String text = "пільги=yes&обєм=1600";

        String[] parts = text.split("&");

        for (int i = 0; i < parts.length; i++) {

            String[] item = parts[i].split("=");

            String name = item[0];
            String value = item[1];

            System.out.println(name + " = " + value);
        }
    }
}
