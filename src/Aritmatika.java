import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka pertama : ");
        byte a = scanner.nextByte();
        System.out.print("Angka kedua : ");
        byte b = scanner.nextByte();
        scanner.close();

        float angka1 = a;
        float angka2 = b;
        float bagi = angka1/angka2;

        System.out.println("Penjumlahan (+) dari "+a+" dan "+b+" adalah "+(a+b));
        System.out.println("Pengurangan (-) dari "+a+" dan "+b+" adalah "+(a-b));
        System.out.println("Pembagian (/) dari "+a+" dan "+b+" adalah "+bagi);
        System.out.println("Perkalian (*) dari "+a+" dan "+b+" adalah "+(a*b));
        System.out.println("Pangkat (^) dari "+a+" dan "+b+" adalah "+(a^b));
    }
}