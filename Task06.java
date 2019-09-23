import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника: ");
        final double W = scanner.nextDouble();
        System.out.println("Введите высоту прямоугольника: ");
        final double Y = scanner.nextDouble();

        System.out.println("Периметр прямоугольника = " + (Math.round((2 * (W + Y)) * 100.0) / 100.0));
        System.out.println("Площадь прямоугольника = " + (Math.round((W * Y) * 100.0) / 100.0));
    }
}
