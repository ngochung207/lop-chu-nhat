import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        double width = sc.nextDouble();
        System.out.println("Nhap vao chieu rong: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        String str = rectangle.display();
        System.out.println(str);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
}
