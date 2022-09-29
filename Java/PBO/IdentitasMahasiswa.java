import java.util.Scanner;

public class IdentitasMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataMahasiswa data = new DataMahasiswa();

        System.out.print("Masukkan NIM: ");
        data.nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        data.nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        data.jk = input.nextLine();

        System.out.println("\n");

        System.out.print(data.namaMahasiswa());
        System.out.print("Anda adalah " + data.jKelamin() + " ");
        System.out.print("Progdi " + data.cekProgdi() + " ");
        System.out.println("Angkatan " + data.cekAngkatan());

        input.close();

    }
}
