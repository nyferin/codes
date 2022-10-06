// Bissextile with OOP
import java.util.Scanner;

public class CobaOOP2 {
    public static void main(String[] args) {
        // DeretBilangan deret = new DeretBilangan();

        // deret.bawah = 0;
        // deret.atas = 15;

        // deret.deretN();
        // deret.deret3N();

        TahunKabisat cekTahun = new TahunKabisat();

        Scanner input = new Scanner(System.in);
        cekTahun.tahun = input.nextInt();
        System.out.println("Tahun " + cekTahun.tahun + " " + cekTahun.cekKabisat());
        input.close();
    }
}
