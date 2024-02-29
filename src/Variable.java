import java.util.Scanner;

public class Variable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Umur : ");
        int umur = scanner.nextByte();
        System.out.print("Gaji : ");
        float gaji = scanner.nextFloat();
        System.out.print("Kota Asal : ");
        String kota = scanner.next();

        System.out.println("Nama Karyawan : "+nama+"\nUmur : "+umur+"\nGaji : "+gaji+"\nKota Asal : "+kota);
    }
}