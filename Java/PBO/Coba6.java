import java.util.Scanner;

public class Coba6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan IPK: ");
        float ipk = input.nextFloat();

        System.out.println("\n\nNama: " + nama + "\nUsia: " + usia + "\nIPK: " + ipk);
        input.close();
    }
}