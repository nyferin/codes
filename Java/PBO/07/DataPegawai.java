import java.util.Scanner;

public class DataPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0, count = 0;
        char menu = '0';

        System.out.print("Masukkan banyak pegawai: ");
        jumlah = input.nextInt();

        long tmp;
        long[] arrGaji = new long[jumlah];
        // Object[] data = new Object[jumlah];
        PegawaiKontrak[] k = new PegawaiKontrak[jumlah];
        PegawaiTetap[] t = new PegawaiTetap[jumlah];

        do {
            System.out.print("MENU\n\n1. Pegawai Kontrak\n2. Peqawai Tetap\nMasukkan pilihan (1-2): ");
            menu = input.next().charAt(0);
            input.nextLine();

            switch (menu) {
                case '1':
                    k[count] = new PegawaiKontrak();
                    System.out.println("FORM\n");
                    System.out.print("Nama\t\t: ");
                    k[count].nama = input.nextLine();
                    System.out.print("NIP\t\t: ");
                    k[count].nip = input.nextLine();
                    System.out.print("Banyak lembur (per jam)\t: ");
                    k[count].banyakLembur = input.nextLong();
                    input.nextLine();
                    k[count].totalGaji = k[count].gajiTotal();
                    arrGaji[count] = k[count].totalGaji;
                    // data[count] = k;
                    count++;
                    break;
                case '2':
                    t[count] = new PegawaiTetap();
                    System.out.println("FORM\n");
                    System.out.print("Nama\t\t: ");
                    t[count].nama = input.nextLine();
                    System.out.print("NIP\t\t: ");
                    t[count].nip = input.nextLine();
                    System.out.print("Banyak lembur (per jam)\t: ");
                    t[count].banyakLembur = input.nextLong();
                    input.nextLine();
                    t[count].totalGaji = t[count].gajiTotal();
                    arrGaji[count] = t[count].totalGaji;
                    // data[count] = t;
                    count++;
                    break;
                default:
                    System.out.print("Pilihan tidak tersedia!\nTekan ENTER untuk kembali . . .");
                    input.nextLine();
                    break;
            }
        } while (count < jumlah);

        do {
            System.out.print(
                    "MENU\n\n1. Cetak semua profil\n2. Gaji terbanyak\n3. Gaji Terkecil\n4. Exit\nMasukkan pilihan (1-4): ");
            menu = input.next().charAt(0);
            input.nextLine();

            switch (menu) {
                case '1':
                    System.out.println("NIP\t\t|Nama\t\t|Gaji Total");
                    for (int i = 0; i < jumlah; i++) {
                        if (k[i] != null) {
                            System.out.println(k[i].nip + "\t|" + k[i].nama + "\t|" + k[i].totalGaji);
                        } else if (t[i] != null) {
                            System.out.println(t[i].nip + "\t|" + t[i].nama + "\t|" + t[i].totalGaji);
                        }
                    }
                    break;
                case '2':
                    tmp = arrGaji[0];
                    count = 0;
                    for (int i = 0; i < arrGaji.length; i++) {
                        if (tmp < arrGaji[i]) {
                            tmp = arrGaji[i];
                            count = i;
                        }
                    }
                    System.out.println("NIP\t\t|Nama\t\t|Gaji Total");
                    if (k[count] != null) {
                        System.out.println(k[count].nip + "\t|" + k[count].nama + "\t|" + k[count].totalGaji);
                    } else if (t[count] != null) {
                        System.out.println(t[count].nip + "\t|" + t[count].nama + "\t|" + t[count].totalGaji);
                    }
                    break;
                case '3':
                    tmp = arrGaji[0];
                    count = 0;
                    for (int i = 0; i < arrGaji.length; i++) {
                        if (tmp > arrGaji[i]) {
                            tmp = arrGaji[i];
                            count = i;
                        }
                    }
                    System.out.println("NIP\t\t|Nama\t\t|Gaji Total");
                    if (k[count] != null) {
                        System.out.println(k[count].nip + "\t|" + k[count].nama + "\t|" + k[count].totalGaji);
                    } else if (t[count] != null) {
                        System.out.println(t[count].nip + "\t|" + t[count].nama + "\t|" + t[count].totalGaji);
                    }
                    break;
                case '4':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Pilihan tidak tersedia!\nTekan ENTER untuk kembali . . .");
                    input.nextLine();
                    break;
            }
        } while (menu != '4');
        input.close();
    }
}
