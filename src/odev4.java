import java.util.Scanner;
public class odev4 {
    public static void main(String[] args) {
        double r, a, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextDouble();

        double alan = (pi * (r*r) * a) / 360;
        System.out.println("Alan : " + alan);

    }
}
