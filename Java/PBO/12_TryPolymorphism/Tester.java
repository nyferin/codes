//Anthony Febrian Aria Sena
//672021037

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan jumlah Binantang: ");
		int jumlah = s.nextInt(), count = 0;
		s.nextLine();
		String pilihan = "0";
		Binatang[] binatang = new Binatang[jumlah];
		Kucing kucing;
		Anjing anjing;

		while (count < jumlah) {
			System.out.println();
			System.out.println("Binatang #" + (count + 1));
			System.out.println("1. Anjing\n2. Kucing");
			System.out.print("Jenis binatang\t: ");
			pilihan = s.nextLine();

			switch (pilihan) {
				case "1":
					anjing = new Anjing();
					System.out.print("Masukkan nama\t\t: ");
					anjing.Nama = s.nextLine();
					System.out.print("Masukkan ras\t\t: ");
					anjing.Ras = s.nextLine();
					System.out.print("Masukkan kecepatan\t: ");
					anjing.setKecepatan(s.nextInt());
					s.nextLine();

					binatang[count] = anjing;
					binatang[count].Jenis = "Anjing";

					count++;
					break;
				case "2":
					kucing = new Kucing();
					System.out.print("Masukkan nama\t: ");
					kucing.Nama = s.nextLine();
					System.out.print("Masukkan ras\t: ");
					kucing.Ras = s.nextLine();
					System.out.print("Masukkan berat\t: ");
					kucing.setBerat(s.nextInt());
					s.nextLine();

					binatang[count] = kucing;
					binatang[count].Jenis = "Kucing";

					count++;
					break;
				default:
					System.out.println("Inputan Salah!");
					break;
			}
		}

		pilihan = "0";
		while (!pilihan.equals("5")) {
			System.out.println();
			System.out.println("===== TUGAS PEMROGRAMAN =====");
			System.out.println("===== POLIMORFISME JAVA =====\n");
			System.out.println("1. Tampilkan semua nama binatang");
			System.out.println("2. Tampilkan semua data binatang");
			System.out.println("3. Tampilkan binatang terberat");
			System.out.println("4. Tampilkan binatang tercepat");
			System.out.println("5. Exit");
			System.out.print("Pilihan: ");
			pilihan = s.nextLine();

			switch (pilihan) {
				case "1":
					System.out.println();
					System.out.println("===== Menu 1 : Semua Nama Binatang =====");
					for (int i = 0; i < binatang.length; i++) {
						System.out.print((i + 1) + ". ");
						binatang[i].CetakNama();
					}
					break;
				case "2":
					System.out.println();
					System.out.println("===== Menu 2 : Semua DATA Binatang =====\n");
					for (int i = 0; i < binatang.length; i++) {
						System.out.println("DATA Binatang ke #" + (i + 1));
						if (binatang[i].Jenis.equals("Anjing")) {
							anjing = (Anjing) binatang[i];
							anjing.Cetak();
						} else if (binatang[i].Jenis.equals("Kucing")) {
							kucing = (Kucing) binatang[i];
							kucing.Cetak();
						}
						System.out.println();
					}
					break;
				case "3":
					int beratMax = -1;
					System.out.println();
					System.out.println("===== Menu 3 : DATA Binatang Terberat =====");
					for (int i = 0; i < binatang.length; i++) {
						if (binatang[i].Jenis.equals("Kucing")) {
							kucing = (Kucing) binatang[i];
							if (kucing.getBerat() > beratMax) {
								beratMax = kucing.getBerat();
							}
						}
					}
					if (beratMax == -1) {
						System.out.println("Tidak ada data kucing");
					} else {
						for (int i = 0; i < binatang.length; i++) {
							if (binatang[i].Jenis.equals("Kucing")) {
								kucing = (Kucing) binatang[i];
								if (kucing.getBerat() == beratMax) {
									System.out.println("Kucing " + kucing.Nama + " adalah yang terberat ("
											+ kucing.getBerat() + " kg)");
								}
							}
						}
					}
					break;
				case "4":
					int kecepatanMax = -1;
					System.out.println();
					System.out.println("===== Menu 4 : DATA Binatang Tercepat =====");
					for (int i = 0; i < binatang.length; i++) {
						if (binatang[i].Jenis.equals("Anjing")) {
							anjing = (Anjing) binatang[i];
							if (anjing.getKecepatan() > kecepatanMax) {
								kecepatanMax = anjing.getKecepatan();
							}
						}
					}
					if (kecepatanMax == -1) {
						System.out.println("Tidak ada data anjing");
					} else {
						for (int i = 0; i < binatang.length; i++) {
							if (binatang[i].Jenis.equals("Anjing")) {
								anjing = (Anjing) binatang[i];
								if (anjing.getKecepatan() == kecepatanMax) {
									System.out.println("Anjing " + anjing.Nama + " adalah yang tercepat ("
											+ anjing.getKecepatan() + " mph)");
								}
							}
						}
					}
					break;
				case "5":
					System.exit(0);
					break;

				default:
					System.out.println("Inputan Salah!");
					break;
			}
		}

		s.close();
	}
}