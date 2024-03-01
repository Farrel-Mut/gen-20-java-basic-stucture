import java.util.Scanner;

public class Habis_dibagi_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih angka : ");
        byte angka = scanner.nextByte();
        int jumlah = 0;

        for(int i=1; i<=angka; i++){
            jumlah += i;
            if(i%3==0 && i%2!=0){
                System.out.print(" Habis ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}
