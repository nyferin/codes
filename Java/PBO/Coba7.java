import java.util.Scanner;

public class Coba7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y;

        System.out.print(
                "KALKULATOR SEDERHANA\n\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n0. Exit menu\n\nMasukkan menu: ");

        int key = input.nextInt();

        switch (key) {
            case 1:
                System.out.print("Masukkan angka 1: ");
                x = input.nextFloat();

                System.out.print("Masukkan angka 2: ");
                y = input.nextFloat();

                System.out.println("Hasil penjumlahan " + x + " dan " + y + " = " + (x + y));
                break;
            case 2:
                System.out.print("Masukkan angka 1: ");
                x = input.nextFloat();

                System.out.print("Masukkan angka 2: ");
                y = input.nextFloat();

                System.out.println("Hasil pengurangan " + x + " dan " + y + " = " + (x - y));
                break;
            case 3:
                System.out.print("Masukkan angka 1: ");
                x = input.nextFloat();

                System.out.print("Masukkan angka 2: ");
                y = input.nextFloat();

                System.out.println("Hasil perkalian " + x + " dan " + y + " = " + (x * y));
                break;
            case 4:
                System.out.print("Masukkan angka 1: ");
                x = input.nextFloat();

                System.out.print("Masukkan angka 2: ");
                y = input.nextFloat();

                System.out.println("Hasil pembagian " + x + " dan " + y + " = " + (x / y));
                break;
            default:
                System.out.println("NGAWUR");
                break;
        }

        input.close();
    }
}
