// Calculator with OOP
import java.util.Scanner;

public class CobaOOP {
    public static void main(String[] args) {
        Calculator hitungan = new Calculator();
        Scanner input = new Scanner(System.in);

        hitungan.angka1 = input.nextInt();
        hitungan.angka2 = input.nextInt();

        hitungan.pengurangan();
        hitungan.pengurangan();

        System.out.println();
        System.out.println("Hasil kali = " + hitungan.perkalian(hitungan.angka1, hitungan.angka2));
        System.out.println("Hasil bagi = " + hitungan.pembagian(hitungan.angka1, hitungan.angka2));
        System.out.println("Hasil pangkat = " + hitungan.pangkat(hitungan.angka1, hitungan.angka2));

        input.close();
    }
}
