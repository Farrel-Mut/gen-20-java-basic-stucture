import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka pertama : ");
        byte a = scanner.nextByte();
        System.out.print("Angka kedua : ");
        byte b = scanner.nextByte();
        scanner.close();

        int increment1 = a++;
        int increment2 = b++;
        int decrement1 = a--;
        int decrement2 = b--;

        System.out.println("Penjumlahan (+) dari "+a+" dan "+b+" adalah "+(a+b));
        System.out.println("Pengurangan (-) dari "+a+" dan "+b+" adalah "+(a-b));
        System.out.println("Pembagian (/) dari "+a+" dan "+b+" adalah "+(a/b));
        System.out.println("Perkalian (*) dari "+a+" dan "+b+" adalah "+(a*b));
        System.out.println("Pangkat (^) dari "+a+" dan "+b+" adalah "+(a^b));
//        System.out.println("Increment (++) dari "+a+" dan "+b+" adalah "+increment1+" dan "+increment2);
//        System.out.println("Decrement (--) dari "+a+" dan "+b+" adalah "+decrement1+" dan "+decrement2);
    }
}