import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tinggi tangga : ");
        byte tangga = scanner.nextByte();
        scanner.close();

        for(int i=0; i<tangga; i++){
            for(int x=0; x<=i; x++){
                System.out.print("* ");
            }
            System.out.println("|_");
        }

    }
}