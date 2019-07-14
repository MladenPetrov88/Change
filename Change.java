import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yoan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitCointPrice = bitcoin * 1168;
        double yoanPrice = yoan * 0.15 * 1.76;
        double totalPrice = bitCointPrice + yoanPrice;

        double priceEuro = totalPrice / 1.95;
        double commisin = priceEuro * (100 - commission) / 100;

        System.out.printf("%.2f", commisin);
    }
}
