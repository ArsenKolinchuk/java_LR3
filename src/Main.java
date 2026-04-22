public class Main {
    public static void main(String[] args) {

        // приклад рядка (замість args[0])
        String input = "пільги=yes&обєм=1600";

        // розділяємо по &
        String[] parts = input.split("&");

        String benefitsPart = parts[0]; // пільги=yes
        String volumePart = parts[1];   // обєм=1600

        // отримуємо значення після =
        String benefits = benefitsPart.split("=")[1];
        int volume = Integer.parseInt(volumePart.split("=")[1]);

        double taxRatePer100 = 20; // ставка (можеш змінити)

        double tax;

        // умова звільнення від податку
        if (benefits.equals("yes") && volume > 1500) {
            tax = 0;
        } else {
            tax = (volume / 100.0) * taxRatePer100;
        }
        System.out.println("Пільги: " + benefits);
        System.out.println("Об'єм: " + volume + " см³");
        System.out.println("Податок: " + tax + " грн");
    }
}
