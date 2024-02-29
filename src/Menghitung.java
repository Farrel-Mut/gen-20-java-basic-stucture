import java.util.Scanner;

public class Menghitung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih angka : ");
        byte angka = scanner.nextByte();
        int jumlah = 0;

        for(int i=1; i<=angka; i++){
            System.out.print(i);
            jumlah += i;
            if(i!=angka){
                System.out.print("+");
            }else if(i==angka){
                System.out.print("= "+jumlah);

            }
        }
    }
}
