import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka pertama : ");
        int a = scanner.nextByte();
        System.out.print("Angka kedua : ");
        int b = scanner.nextByte();
        scanner.close();

        int angka = a + b;

        System.out.print("Hasil penjumlahannya ");
        if (angka%2 == 0) {
            System.out.print("`Genap`");
        } else {
            System.out.print("`Ganjil`");
        }
    }
}